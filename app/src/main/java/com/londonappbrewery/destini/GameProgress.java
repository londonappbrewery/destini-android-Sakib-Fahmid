package com.londonappbrewery.destini;

public class GameProgress {

    private String mCurrentProgressStory;
    private String mCurrentProgressTopButtonAnswer;
    private String mCurrentProgressBottomButtonAnswer;

    public GameProgress(String storyStringName, String storyAnswerOneStringName, String storyAnswerTwoStringName){
        mCurrentProgressStory=storyStringName;
        mCurrentProgressTopButtonAnswer=storyAnswerOneStringName;
        mCurrentProgressBottomButtonAnswer=storyAnswerTwoStringName;
    }


    public String getCurrentProgressStory() {
        return mCurrentProgressStory;
    }

    public void setCurrentProgressStory(String mCurrentProgressStory) {
        this.mCurrentProgressStory = mCurrentProgressStory;
    }

    public String getCurrentProgressTopButtonAnswer() {
        return mCurrentProgressTopButtonAnswer;
    }

    public void setCurrentProgressTopButtonAnswer(String mCurrentProgressTopButtonAnswer) {
        this.mCurrentProgressTopButtonAnswer = mCurrentProgressTopButtonAnswer;
    }

    public String getCurrentProgressBottomButtonAnswer() {
        return mCurrentProgressBottomButtonAnswer;
    }

    public void setCurrentProgressBottomButtonAnswer(String mCurrentProgressBottomButtonAnswer) {
        this.mCurrentProgressBottomButtonAnswer = mCurrentProgressBottomButtonAnswer;
    }
}
