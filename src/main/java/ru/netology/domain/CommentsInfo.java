package ru.netology.domain;

public class CommentsInfo {
    private int count;
    private boolean canPostComment;
    private boolean groupsCanPostComment;
    private boolean canCloseComment; /*true, if the current user may block comments*/
    private boolean canOpenComment; /*true, if the current user may unblock comments*/

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isCanPost() {
        return canPostComment;
    }

    public void setCanPost(boolean canPost) {
        this.canPostComment = canPost;
    }

    public boolean isGroupsCanPost() {
        return groupsCanPostComment;
    }

    public void setGroupsCanPost(boolean groupsCanPost) {
        this.groupsCanPostComment = groupsCanPost;
    }

    public boolean isCanClose() {
        return canCloseComment;
    }

    public void setCanClose(boolean canClose) {
        this.canCloseComment = canClose;
    }

    public boolean isCanOpen() {
        return canOpenComment;
    }

    public void setCanOpen(boolean canOpen) {
        this.canOpenComment = canOpen;
    }
}

