package com.example.footballleaguestv;

import android.app.Activity;
import android.os.Bundle;

/*
 * @Проект Football Leagues TV содержит 5 футбольных лиг и количество команд
 * в виде карточек горизонтального списка для Android TV
 * @автор Рушан Чанышев
*/

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


}
