package com.eltex;

public record Attachment(String url, AttachmentType type) {

    public enum AttachmentType {
        IMAGE,
        VIDEO,
        AUDIO,
    }
}