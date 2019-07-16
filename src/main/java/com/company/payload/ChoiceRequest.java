package com.company.payload;

import javax.print.DocFlavor;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * Created by Shoh Jahon on 10.09.2018.
 */
public class ChoiceRequest {
    @NotBlank
    @Size(max = 40)
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
