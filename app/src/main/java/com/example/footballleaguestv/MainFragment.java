package com.example.footballleaguestv;

import android.os.Bundle;
import android.util.Log;
import androidx.core.content.ContextCompat;
import androidx.leanback.app.BrowseFragment;
import androidx.leanback.widget.ArrayObjectAdapter;
import androidx.leanback.widget.HeaderItem;
import androidx.leanback.widget.ListRow;
import androidx.leanback.widget.ListRowPresenter;

/*
 * @Проект Football Leagues TV содержит 5 футбольных лиг и количество команд
 * в виде карточек горизонтального списка для Android TV
 * @автор Рушан Чанышев
 * @ Класс MainFragment унаследованный от класса BrowseFragment создает UI приложения
 * и наполняет контент
 */

public class MainFragment extends BrowseFragment {

    public static final String TAG = MainFragment.class.getSimpleName();

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        Log.i(TAG, "onActivityCreated");
        super.onActivityCreated(savedInstanceState);
        setupUIElements();
        loadRows();
    }

    // Заголовок и цвет боковой панели UI
    public void setupUIElements() {
        setTitle("Football Leagues 2019/2020");
        int color = ContextCompat.getColor(getActivity(), R.color.colorPrimary);
        setBrandColor(color);
    }

    public void loadRows() {
        // Адаптер, отвечающий за ListRow (ListRow = заголовок лиги + список клубов)
        ArrayObjectAdapter rowsAdapter = new ArrayObjectAdapter(new ListRowPresenter());

        /* Класс, отвечающий за заголовок лиги на боковой панели,
        в конструкторе указываем место и название лиги */
        HeaderItem headerItemPremier = new HeaderItem(0, "Premier Ligue");
        HeaderItem headerItemLaLiga = new HeaderItem(1, "La Liga");
        HeaderItem headerItemSeriaA = new HeaderItem(2, "Seria A");
        HeaderItem headerItemBundesliga = new HeaderItem(3, "Bundesliga");
        HeaderItem headerItemLigue1 = new HeaderItem(4, "Ligue 1");

        // Класс, отвечающий за заполнение клубов
        GridItemPresenter itemPresenter = new GridItemPresenter();

        // Адаптер, отвечающий за отображение клубов
        ArrayObjectAdapter gridAdapterPremier = new ArrayObjectAdapter(itemPresenter);
        ArrayObjectAdapter gridAdapterLaLiga = new ArrayObjectAdapter(itemPresenter);
        ArrayObjectAdapter gridAdapterSeriaA = new ArrayObjectAdapter(itemPresenter);
        ArrayObjectAdapter gridAdapterBundesliga = new ArrayObjectAdapter(itemPresenter);
        ArrayObjectAdapter gridAdapterLigue1 = new ArrayObjectAdapter(itemPresenter);

        // В адаптер, отвечающий за ListRows, добавляем ListRow
        /* В конструктор передается класс, отвечающий за заголовок лиги и адаптер, отвечающий за
        отображение списка клубов */
        rowsAdapter.add(new ListRow(headerItemPremier, gridAdapterPremier));
        rowsAdapter.add(new ListRow(headerItemLaLiga, gridAdapterLaLiga));
        rowsAdapter.add(new ListRow(headerItemSeriaA, gridAdapterSeriaA));
        rowsAdapter.add(new ListRow(headerItemBundesliga, gridAdapterBundesliga));
        rowsAdapter.add(new ListRow(headerItemLigue1, gridAdapterLigue1));
        setAdapter(rowsAdapter);

        // Добавление клубов Premier Ligue
        gridAdapterPremier.add(0, "Liverpool");
        gridAdapterPremier.add(1, "Manchester City");
        gridAdapterPremier.add(2, "Leicester City");
        gridAdapterPremier.add(3, "Chelsea");
        gridAdapterPremier.add(4, "Wolverhampton");
        gridAdapterPremier.add(5, "Manchester United");
        gridAdapterPremier.add(6, "Tottenham Hotspur");
        gridAdapterPremier.add(7, "Burnley");
        gridAdapterPremier.add(8, "Sheffield United");
        gridAdapterPremier.add(9, "Arsenal");
        gridAdapterPremier.add(10, "Crystal Palace");
        gridAdapterPremier.add(11, "Everton");
        gridAdapterPremier.add(12, "Southampton");
        gridAdapterPremier.add(13, "Newcastle United");
        gridAdapterPremier.add(14, "Brighton");
        gridAdapterPremier.add(15, "Watford");
        gridAdapterPremier.add(16, "West Ham United");
        gridAdapterPremier.add(17, "Bournemouth");
        gridAdapterPremier.add(18, "Aston Villa");
        gridAdapterPremier.add(19, "Norwich City");

        // Добавление клубов La Liga
        gridAdapterLaLiga.add(0, "Real Madrid");
        gridAdapterLaLiga.add(1, "Barcelona");
        gridAdapterLaLiga.add(2, "Atletico Madrid");
        gridAdapterLaLiga.add(3, "Sevilla");
        gridAdapterLaLiga.add(4, "Getafe");
        gridAdapterLaLiga.add(5, "Villareal");
        gridAdapterLaLiga.add(6, "Real Sociedad");
        gridAdapterLaLiga.add(7, "Valencia");
        gridAdapterLaLiga.add(8, "Athletic Bilbao");
        gridAdapterLaLiga.add(9, "Granada");
        gridAdapterLaLiga.add(10, "Osasuna");
        gridAdapterLaLiga.add(11, "Levante");
        gridAdapterLaLiga.add(12, "Real Betis");
        gridAdapterLaLiga.add(13, "Real Valladolid");
        gridAdapterLaLiga.add(14, "Eibar");
        gridAdapterLaLiga.add(15, "Alaves");
        gridAdapterLaLiga.add(16, "Celta Vigo");
        gridAdapterLaLiga.add(17, "Real Mallorca");
        gridAdapterLaLiga.add(18, "Leganes");
        gridAdapterLaLiga.add(19, "Espanyol");

        // Добавление клубов Seria A
        gridAdapterSeriaA.add(0, "Juventus");
        gridAdapterSeriaA.add(1, "Lazio");
        gridAdapterSeriaA.add(2, "Inter");
        gridAdapterSeriaA.add(3, "Atalanta");
        gridAdapterSeriaA.add(4, "Roma");
        gridAdapterSeriaA.add(5, "Napoli");
        gridAdapterSeriaA.add(6, "Milan");
        gridAdapterSeriaA.add(7, "Parma");
        gridAdapterSeriaA.add(8, "Verona");
        gridAdapterSeriaA.add(9, "Cagliari");
        gridAdapterSeriaA.add(10, "Bologna");
        gridAdapterSeriaA.add(11, "Sassuolo");
        gridAdapterSeriaA.add(12, "Fiorentina");
        gridAdapterSeriaA.add(13, "Torino");
        gridAdapterSeriaA.add(14, "Udinese");
        gridAdapterSeriaA.add(15, "Genoa");
        gridAdapterSeriaA.add(16, "Sampdoria");
        gridAdapterSeriaA.add(17, "Lecce");
        gridAdapterSeriaA.add(18, "Brescia");
        gridAdapterSeriaA.add(19, "Spal");

        // Добавление клубов BundesLiga
        gridAdapterBundesliga.add(0, "Bayern Munich");
        gridAdapterBundesliga.add(1, "Borussia Dortmund");
        gridAdapterBundesliga.add(2, "RB Leipzig");
        gridAdapterBundesliga.add(3, "Mgladbach");
        gridAdapterBundesliga.add(4, "Bayer Leverkusen");
        gridAdapterBundesliga.add(5, "Hoffenheim");
        gridAdapterBundesliga.add(6, "Wolfsburg");
        gridAdapterBundesliga.add(7, "Freiburg");
        gridAdapterBundesliga.add(8, "Eintracht");
        gridAdapterBundesliga.add(9, "Hertha");
        gridAdapterBundesliga.add(10, "Union");
        gridAdapterBundesliga.add(11, "Schalke");
        gridAdapterBundesliga.add(12, "Mainz");
        gridAdapterBundesliga.add(13, "Cologne");
        gridAdapterBundesliga.add(14, "Augsburg");
        gridAdapterBundesliga.add(15, "Werder Bremen");
        gridAdapterBundesliga.add(16, "Fortuna");
        gridAdapterBundesliga.add(17, "Paderborn");

        // Добавление клубов Ligue 1
        gridAdapterLigue1.add(0, "Paris Saint-Germain");
        gridAdapterLigue1.add(1, "Marseille");
        gridAdapterLigue1.add(2, "Rennes");
        gridAdapterLigue1.add(3, "Lille");
        gridAdapterLigue1.add(4, "Nice");
        gridAdapterLigue1.add(5, "Reims");
        gridAdapterLigue1.add(6, "Lyon");
        gridAdapterLigue1.add(7, "Montpellier");
        gridAdapterLigue1.add(8, "Monaco");
        gridAdapterLigue1.add(9, "Strasbourg");
        gridAdapterLigue1.add(10, "Angers");
        gridAdapterLigue1.add(11, "Bordeaux");
        gridAdapterLigue1.add(12, "Nantes");
        gridAdapterLigue1.add(13, "Brest");
        gridAdapterLigue1.add(14, "Metz");
        gridAdapterLigue1.add(15, "Dijon");
        gridAdapterLigue1.add(16, "St Etienne");
        gridAdapterLigue1.add(17, "Nimes");
        gridAdapterLigue1.add(18, "Amiens");
        gridAdapterLigue1.add(19, "Toulouse");

        }
    }