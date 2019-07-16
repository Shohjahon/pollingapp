package com.company.payload;

import javax.validation.constraints.NotNull;

/**
 * Created by Shoh Jahon on 10.09.2018.
 */
public class VoteRequest {
    @NotNull
    private Long choiceId;

    public Long getChoiceId() {
        return choiceId;
    }

    public void setChoiceId(Long choiceId) {
        this.choiceId = choiceId;
    }
}
