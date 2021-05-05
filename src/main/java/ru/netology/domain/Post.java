package ru.netology.domain;

import java.util.Date;

public class Post {
    private int id;
    private int ownerId;
    private int fromID;
    private int createdBy;
    private String text;
    private int replyOwnerId;
    private int replyPostId;
    private int friendOnly;
    private CommentsInfo commentsInfo;
    private String copyright;
    private LikesInfo likesInfo;
    private SharesInfo sharesInfo;
    private ViewsInfo viewsInfo;
    private String postType;
    private PostSource postSource;
    private GeoInfo geoInfo;
    private LocationInfo locationInfo;
    private int signerId;
    private int canPin;
    private int canDelete;
    private int canEdit;
    private int isPinned;
    private int markedAsAds;
    private boolean isFavorite;
    private int postponedId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public int getFromID() {
        return fromID;
    }

    public void setFromID(int fromID) {
        this.fromID = fromID;
    }

    public int getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getReplyOwnerId() {
        return replyOwnerId;
    }

    public void setReplyOwnerId(int replyOwnerId) {
        this.replyOwnerId = replyOwnerId;
    }

    public int getReplyPostId() {
        return replyPostId;
    }

    public void setReplyPostId(int replyPostId) {
        this.replyPostId = replyPostId;
    }

    public int getFriendOnly() {
        return friendOnly;
    }

    public void setFriendOnly(int friendOnly) {
        this.friendOnly = friendOnly;
    }

    public CommentsInfo getCommentsInfo() {
        return commentsInfo;
    }

    public void setCommentsInfo(CommentsInfo commentsInfo) {
        this.commentsInfo = commentsInfo;
    }

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    public LikesInfo getLikesInfo() {
        return likesInfo;
    }

    public void setLikesInfo(LikesInfo likesInfo) {
        this.likesInfo = likesInfo;
    }

    public SharesInfo getSharesInfo() {
        return sharesInfo;
    }

    public void setSharesInfo(SharesInfo sharesInfo) {
        this.sharesInfo = sharesInfo;
    }

    public ViewsInfo getViewsInfo() {
        return viewsInfo;
    }

    public void setViewsInfo(ViewsInfo viewsInfo) {
        this.viewsInfo = viewsInfo;
    }

    public String getPostType() {
        return postType;
    }

    public void setPostType(String postType) {
        this.postType = postType;
    }

    public PostSource getPostSource() {
        return postSource;
    }

    public void setPostSource(PostSource postSource) {
        this.postSource = postSource;
    }

    public GeoInfo getGeoInfo() {
        return geoInfo;
    }

    public void setGeoInfo(GeoInfo geoInfo) {
        this.geoInfo = geoInfo;
    }

    public LocationInfo getLocationInfo() {
        return locationInfo;
    }

    public void setLocationInfo(LocationInfo locationInfo) {
        this.locationInfo = locationInfo;
    }

    public int getSignerId() {
        return signerId;
    }

    public void setSignerId(int signerId) {
        this.signerId = signerId;
    }

    public int getCanPin() {
        return canPin;
    }

    public void setCanPin(int canPin) {
        this.canPin = canPin;
    }

    public int getCanDelete() {
        return canDelete;
    }

    public void setCanDelete(int canDelete) {
        this.canDelete = canDelete;
    }

    public int getCanEdit() {
        return canEdit;
    }

    public void setCanEdit(int canEdit) {
        this.canEdit = canEdit;
    }

    public int getIsPinned() {
        return isPinned;
    }

    public void setIsPinned(int isPinned) {
        this.isPinned = isPinned;
    }

    public int getMarkedAsAds() {
        return markedAsAds;
    }

    public void setMarkedAsAds(int markedAsAds) {
        this.markedAsAds = markedAsAds;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }

    public int getPostponedId() {
        return postponedId;
    }

    public void setPostponedId(int postponedId) {
        this.postponedId = postponedId;
    }
}