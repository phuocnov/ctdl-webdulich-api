package webdulich.webdulich.cloudinary;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class PhotoUploadValidator implements Validator {
    public boolean supports(Class clazz) {
        return PhotoUploadModel.class.equals(clazz);
    }

    @Override
    public void validate(Object obj, Errors e) {
        ValidationUtils.rejectIfEmpty(e, "title", "title.empty");
        PhotoUploadModel pu = (PhotoUploadModel) obj;
        if (pu.getFile() == null || pu.getFile().isEmpty()) {
            if (!pu.validSignature()) {
                e.rejectValue("signature", "signature.mismatch");
            }
        }
    }
}
