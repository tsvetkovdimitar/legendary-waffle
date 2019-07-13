package org.tsvetkovdimitar.sparta.domain.models.binding;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class AddPostBindingModel {

    private String text;

    public AddPostBindingModel() {


    }


    @NotNull
    @Size(min = 1, max = 5000, message = "Minimum of 1 and maximum of 5000 characters is required.")
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}
