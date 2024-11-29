package com.Sonic.FilmProject.DefineSomethings;
import java.text.Normalizer;
public class SlugUtils {

    public static String toSlug(String input) {
        if (input == null || input.length() == 0) {
            return null;
        }

        // Chuyển thành chữ thường
        String lowerCase = input.toLowerCase();

        // Chuyển ký tự có dấu thành không dấu
        String removeAccents = Normalizer.normalize(lowerCase, Normalizer.Form.NFD);
        removeAccents = removeAccents.replaceAll("[^\\p{ASCII}]", "");

        // Thay khoảng trắng bằng dấu gạch ngang
        String slug = removeAccents.replaceAll("\\s+", "-");

        // Xóa các ký tự đặc biệt
        slug = slug.replaceAll("[^a-z0-9-]", "");

        // Đảm bảo slug không bắt đầu hay kết thúc bằng dấu gạch ngang
        slug = slug.replaceAll("^-+", "").replaceAll("-+$", "");

        return slug;
    }

    public static String toSlugPlusEpisode(String slugName, long episode) {
        return toSlug(slugName) + "-tap-" + episode;
    }
}
