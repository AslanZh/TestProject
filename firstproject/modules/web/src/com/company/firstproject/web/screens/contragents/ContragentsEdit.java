package com.company.firstproject.web.screens.contragents;

import com.haulmont.cuba.core.entity.FileDescriptor;
import com.haulmont.cuba.core.global.DataManager;
import com.haulmont.cuba.core.global.FileStorageException;
import com.haulmont.cuba.gui.Notifications;
import com.haulmont.cuba.gui.components.*;
import com.haulmont.cuba.gui.components.data.value.ContainerValueSource;
import com.haulmont.cuba.gui.data.DataSupplier;
import com.haulmont.cuba.gui.export.ExportDisplay;
import com.haulmont.cuba.gui.export.ExportFormat;
import com.haulmont.cuba.gui.model.InstanceContainer;
import com.haulmont.cuba.gui.screen.*;
import com.company.firstproject.entity.Contragents;
import com.haulmont.cuba.gui.upload.FileUploadingAPI;

import javax.inject.Inject;
import java.io.File;
import java.util.Map;

@UiController("firstproject_Contragents.edit")
@UiDescriptor("contragents-edit.xml")
@EditedEntityContainer("contragentsDc")
@LoadDataBeforeShow
public class ContragentsEdit extends StandardEditor<Contragents> {



    @Inject
    private InstanceContainer<Contragents> contragentsDc;
    @Inject
    private Image logoImage;

    @Inject
    private FileUploadField uploadField;
    @Inject
    private FileUploadingAPI fileUploadingAPI;
    @Inject
    private DataManager dataManager;
    @Inject
    private Notifications notifications;
    @Inject
    private Button clearImageBtn;

    @Subscribe
    protected void onInit(InitEvent event) { /*
The onInit() method first initializes the uploadField component that is used for uploading new images.*/
        uploadField.addFileUploadSucceedListener(uploadSucceedEvent -> {

            File file = fileUploadingAPI.getFile(uploadField.getFileId());
            if (file != null) {
                notifications.create()
                        .withCaption("File is uploaded to temporary storage at " + file.getAbsolutePath())
                        .show();
            }

            FileDescriptor fd = uploadField.getFileDescriptor();
            try {
                fileUploadingAPI.putFileIntoStorage(uploadField.getFileId(), fd);
            } catch (FileStorageException e) {
                throw new RuntimeException("Error saving file to FileStorage", e);
            }
            getEditedEntity().setImage(fd);
            dataManager.commit(getEditedEntity());
            notifications.create()
                    .withCaption("Uploaded file: " + uploadField.getFileName())
                    .show();
            displayImage();
        });

        uploadField.addFileUploadErrorListener(uploadErrorEvent ->
                notifications.create()
                        .withCaption("File upload error")
                        .show());

        contragentsDc.addItemPropertyChangeListener(contragentsItemPropertyChangeEvent -> {
            if ("imageFile".equals(contragentsItemPropertyChangeEvent.getProperty()))
                updateImageButtons(contragentsItemPropertyChangeEvent.getValue() != null);
        });
    }

    @Subscribe
    protected void onAfterShow(AfterShowEvent event) {
        displayImage();
        updateImageButtons(getEditedEntity().getImage() != null);
    }

    public void onClearImageBtnClick() {
        getEditedEntity().setImage(null);
        displayImage();
    }

    private void updateImageButtons(boolean enable) {
        clearImageBtn.setEnabled(enable);
    }

    private void displayImage() {
        if (getEditedEntity().getImage() != null) {
            logoImage.setSource(FileDescriptorResource.class).setFileDescriptor(getEditedEntity().getImage());
            logoImage.setVisible(true);
        } else {
            logoImage.setVisible(false);
        }
    }


}