package com.example.footballleaguestv;

import android.graphics.Color;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.leanback.widget.Presenter;

/*
 * @Проект Football Leagues TV содержит 5 футбольных лиг и количество команд
 * в виде карточек горизонтального списка для Android TV
 * @автор Рушан Чанышев
 * @Класс GridItemPresenter унаследованный от класса Presenter устанавливает параметры
 * UI приложения
 */

public class GridItemPresenter extends Presenter {

    // Ширина и высота карточки клуба (CardInfo)
    public static final int WIDTH_ITEM = 200;
    public static final int HEIGHT_ITEM = 100;

    /* Абстрактный класс Presenter определяет отображение клубов
    из него нужно переопределить 3 метода ViewHolder: onCreate, onBind, onUnbind */
    // Класс ViewHolder позволяет ссылаться к View клубам (получить доступ к View)

    // Установка параметров для карточки клуба
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent) {
        TextView view = new TextView(parent.getContext());
        view.setLayoutParams(new ViewGroup.LayoutParams(WIDTH_ITEM, HEIGHT_ITEM));
        view.setFocusable(true);
        view.setFocusableInTouchMode(true);
        view.setGravity(Gravity.CENTER);
        view.setBackgroundColor(ContextCompat.getColor(parent.getContext(), R.color.colorPrimaryDark));
        view.setTextColor(Color.WHITE);
        return new ViewHolder(view);
    }

    // Текст карточки клуба
    @Override
    public void onBindViewHolder(ViewHolder viewHolder, Object item) {
        TextView textView = (TextView) viewHolder.view;
        String str = (String) item;
        textView.setText(str);
        textView.setTextSize(18);
    }

    @Override
    public void onUnbindViewHolder(ViewHolder viewHolder) {

    }
}