package com.londonappbrewery.quizzler;

public class TrueFalse {
    private int quiestionID;
    private boolean mTrueFalse;

    public TrueFalse(int quiestionId, boolean mAnswer) {
        quiestionID = quiestionId;
        mTrueFalse = mAnswer;
    }

    public int getQuiestionID() {
        return quiestionID;
    }

    public void setQuiestionID(int quiestionID) {
        this.quiestionID = quiestionID;
    }

    public boolean isTrueFalse() {
        return mTrueFalse;
    }

    public void setTrueFalse(boolean trueFalse) {
        mTrueFalse = trueFalse;
    }
}
