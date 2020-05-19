package view;

import bean.ItemAdv;

public class ItemView {
    public static void main(String[] args) {
        ItemAdv.Builder build = ItemAdv.builder()
                .id("1")
                .shortName("1")
                .original("1");

        ItemAdv item1 = build.build();
        ItemAdv item2 = build.name("hello").build();
    }
}
