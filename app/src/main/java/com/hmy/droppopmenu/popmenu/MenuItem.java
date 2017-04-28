package com.hmy.droppopmenu.popmenu;

/**
 * Created by HMY on 2016/11/7/007.
 */
public class MenuItem {
    public int iconResId;
    public int itemId;
    public String itemTitle;

    public MenuItem(int itemId, String itemTitle) {
        this.itemId = itemId;
        this.itemTitle = itemTitle;
    }

    public MenuItem(int iconResId, int itemId, String itemTitle) {
        this.iconResId = iconResId;
        this.itemId = itemId;
        this.itemTitle = itemTitle;
    }

    public int getIconResId() {
        return iconResId;
    }

    public int getItemId() {
        return itemId;
    }

    public String getItemTitle() {
        return itemTitle;
    }
}
