# DropPopMenu
显示位置跟随操作按钮显示的带箭头的弹出菜单

![](https://github.com/HMY314/DropPopMenu/blob/master/gif/GIF.gif)


---
## 一、介绍
    本项目是对带箭头的下拉弹出菜单进行了封装，使用简单，同时有如下特点：
        1、可以动态修改菜单的背景；
        2、弹出位置是依赖于操作按钮的位置显示，处理了按钮在边界位置引起的菜单显示错位问题；
        3、菜单宽度以文字的最大长度作为宽度动态计算了；
        4、菜单默认弹窗方向是在操作按钮下面，当操作按钮在屏幕底部时，或者菜单的
        高度不能完全显示时，菜单是显示在操作按钮上面的

---
## 二、使用
    1、默认风格

        View view = findViewById......
        mDropPopMenu = new DropPopMenu(this);
        mDropPopMenu.setOnItemClickListener(new DropPopMenu.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id, MenuItem menuItem) {
                Toast.makeText(MainActivity.this, "点击了 " + menuItem.getItemId(), Toast.LENGTH_SHORT).show();
            }
        });
        mDropPopMenu.setMenuList(getMenuList());
        mDropPopMenu.show(view);


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

![](https://github.com/HMY314/DropPopMenu/blob/master/gif/img1.png)
![](https://github.com/HMY314/DropPopMenu/blob/master/gif/img2.png)

---

    2、改变弹窗背景、文字颜色

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

![](https://github.com/HMY314/DropPopMenu/blob/master/gif/img3.png)
---

    3、显示图标

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

![](https://github.com/HMY314/DropPopMenu/blob/master/gif/img4.png)