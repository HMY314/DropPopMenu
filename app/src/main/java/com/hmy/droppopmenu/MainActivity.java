package com.hmy.droppopmenu;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import com.hmy.droppopmenu.popmenu.DropPopMenu;
import com.hmy.droppopmenu.popmenu.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {

    private DropPopMenu mDropPopMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mDropPopMenu = new DropPopMenu(this);
        mDropPopMenu.setOnItemClickListener(new DropPopMenu.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id, MenuItem menuItem) {
                Toast.makeText(MainActivity.this, "点击了 " + menuItem.getItemId(), Toast.LENGTH_SHORT).show();
            }
        });
        mDropPopMenu.setMenuList(getMenuList());
    }

    public void onClickPop(View view) {
        mDropPopMenu.show(view);
    }

    public void onClickPopWhite(View view) {
        DropPopMenu dropPopMenu = new DropPopMenu(this);
        dropPopMenu.setTriangleIndicatorViewColor(Color.WHITE);
        dropPopMenu.setBackgroundResource(R.drawable.bg_drop_pop_menu_white_shap);
        dropPopMenu.setItemTextColor(Color.BLACK);

        dropPopMenu.setOnItemClickListener(new DropPopMenu.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id, MenuItem menuItem) {
                Toast.makeText(MainActivity.this, "点击了 " + menuItem.getItemId(), Toast.LENGTH_SHORT).show();
            }
        });
        dropPopMenu.setMenuList(getMenuList());

        dropPopMenu.show(view);
    }

    public void onClickPopIcon(View view) {
        DropPopMenu dropPopMenu = new DropPopMenu(this);
        dropPopMenu.setTriangleIndicatorViewColor(Color.WHITE);
        dropPopMenu.setBackgroundResource(R.drawable.bg_drop_pop_menu_white_shap);
        dropPopMenu.setItemTextColor(Color.BLACK);
        dropPopMenu.setIsShowIcon(true);

        dropPopMenu.setOnItemClickListener(new DropPopMenu.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id, MenuItem menuItem) {
                Toast.makeText(MainActivity.this, "点击了 " + menuItem.getItemId(), Toast.LENGTH_SHORT).show();
            }
        });
        dropPopMenu.setMenuList(getIconMenuList());

        dropPopMenu.show(view);
    }

    private List<MenuItem> getIconMenuList() {
        List<MenuItem> list = new ArrayList<>();
        list.add(new MenuItem(R.drawable.ic_honor_level1, 1, "选项1"));
        list.add(new MenuItem(R.drawable.ic_honor_level2, 2, "选项2"));
        list.add(new MenuItem(R.drawable.ic_honor_level3, 3, "选项3"));
        return list;
    }

    private List<MenuItem> getMenuList() {
        List<MenuItem> list = new ArrayList<>();
        list.add(new MenuItem(1, "选项"));
        list.add(new MenuItem(2, "选项选项选项"));
        list.add(new MenuItem(3, "选项选项选项选项"));
        list.add(new MenuItem(4, "选项选项"));
        list.add(new MenuItem(5, "选项选项选项"));
        list.add(new MenuItem(5, "选项选项选项选项"));
        return list;
    }
}
