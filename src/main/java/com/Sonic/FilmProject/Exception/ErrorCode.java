package com.Sonic.FilmProject.Exception;


public enum ErrorCode {
    FILMNOTFOUND(2000, "Không tìm thấy phim"),
    FILMEXISTS(2001, "Phim đã tồn tại"),
    EPISODEFILMEXSTED(2002, "Tập phim này đã tồn tại"),
    EPISODEFILMNOTFOUND(2003, "Không thể tìm thấy tập phim này"),
    LINKEPISODENOTFOUND(2004, "Không tìm thấy link phim này"),
    DIRECTORNOTFOUND(2005, "Không tìm thấy giám đốc sản xuất"),
    NOTFOUNDACTOR(2006, "Không tìm thấy diễn viên"),
    SLUGDESCRIPTIONEXISTED(2007, "Bộ phim này đã có miêu tả rồi"),
    SLUGDESCRIPTIONNOTFOUND(2008, "Không tìm thấy mô tả cho phim hiện tại")
    ;
    ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }
    private int code;
    private String message;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


}
