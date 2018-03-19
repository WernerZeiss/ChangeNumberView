# ChangeNumberView
价格修改器

## 效果

上面是ChangeNumberView效果，下面是EditNumberView效果

![](https://github.com/WernerZeiss/ChangeNumberView/blob/master/screenshot/GIF.gif)

## 特点

* 内含ChangeNumberView和EditNumberView，前者显示内容不可直接编辑，仅通过加减按钮进行改变。后者可以直接编辑数字
* 加减按钮可以点击和长按。长按是连续加或连续减，直到减到最小值0
* 点击和长按进行加和减时，可以设置每次加减的幅度值和间隔时间
* 所有组件都可以获取到，可自由设置想要的属性及添加监听（增减的按钮已屏蔽点击事件，设置onClickListener无效）

## 使用

直接在xml中

``` java
    <com.cwq.library.ChangeNumberView
        android:id="@+id/changeNumberView"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginLeft="20dp"
        android:layout_marginTop="20dp" />
        
        
    <com.cwq.library.EditNumberView
        android:id="@+id/editNumberView"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginLeft="20dp"
        android:layout_marginTop="20dp" />        
```

## 方法属性

* ChangeNumberView方法说明

方法名 | 说明
------|-------
setContent(double content)|设置显示的数字，最小为0
getContent()|获得显示的数字,String类型
setUpdateStepValue(double step)|设置每次加减时的单位值
getUpdateStepValue()|获取当前每次加减的单位值
setChangeDelay(long time)|设置连续加减的间隔时间ms,必须大于0
getChangeDelay()|获取当前连续加减的间隔时间
getContentTextView()|获取中间显示控件TextView
getLeftImageView()|获取左侧ImageView
getRightImageView|获取右侧ImageView

* EditNumberView方法说明

方法名 | 说明
-------|-------
setContent(double content)|设置显示的数字
getContent()|获取显示的文字,String类型
setUpdateStepValue(double step)|设置每次加减时的单位值
getUpdateStepValue()|获取当前每次加减的单位值
setChangeDelay(long time)|设置连续加减的间隔时间ms,必须大于0
getChangeDelay()|获取当前连续加减的间隔时间
getEditText()|获取中间控件EditText
getLeftImageView()|获取左侧ImageView
getRightImageView|获取右侧ImageView
setPointLength(int length)|设置可输入小数点位数
