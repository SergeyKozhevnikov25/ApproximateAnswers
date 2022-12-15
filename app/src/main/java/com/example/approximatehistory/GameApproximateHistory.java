package com.example.approximatehistory;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;

public class GameApproximateHistory extends AppCompatActivity {

    private TextView tvResultApproximateHistory, tvQuestionApproximateHistory;
    private TextView btnNextApproximateHistory, btnAnswerApproximateHistory;
    private EditText etInputApproximateHistory;
    private final ArrayList<String> gameApproximateHistory = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_activity_approximate_history);
        tvQuestionApproximateHistory = findViewById(R.id.tv_question_approximate_history);
        tvResultApproximateHistory = findViewById(R.id.tv_result_approximate_history);
        etInputApproximateHistory = findViewById(R.id.et_input_approximate_history);
        btnAnswerApproximateHistory = findViewById(R.id.btn_answer_approximate_history);
        btnNextApproximateHistory = findViewById(R.id.btn_next_approximate_history);
        addQuestionsApproximateHistory();
        setQuestionApproximateHistory();
    }

    private void addQuestionsApproximateHistory() {
        gameApproximateHistory.add("Падение Западной Римской империи*476");
        gameApproximateHistory.add("Возникновение ислама*610");
        gameApproximateHistory.add("Провозглашение Карла Великого императором*800");
        gameApproximateHistory.add("Распад Франкской империи*843");
        gameApproximateHistory.add("Образование Священной Римской империи*962");
        gameApproximateHistory.add("Разделение Христианской церкви на Восточную (православную) и Западную (католическую)*1054");
        gameApproximateHistory.add("Нормандское завоевание Англии*1066");
        gameApproximateHistory.add("Первый крестовый поход*1096");
        gameApproximateHistory.add("Захват Константинополя крестоносцами*1204");
        gameApproximateHistory.add("Принятие Великой хартии вольности в Англии*1215");
        gameApproximateHistory.add("Возникновение Английского парламента*1265");
        gameApproximateHistory.add("Начало столетней войны*1337");
        gameApproximateHistory.add("Окончание столетней войны*1453");
        gameApproximateHistory.add("Жакерия во Франции*1358");
        gameApproximateHistory.add("Восстание под предводительством У. Тайлера в Англии*1382");
        gameApproximateHistory.add("Битва на Косовом поле*1389 ");
        gameApproximateHistory.add("Окончание гуситских войн*1435");
        gameApproximateHistory.add("Изобретение книгопечатания И.Гуттенбергом*1440");
        gameApproximateHistory.add("Начало войны Алой и Белой розы в Англии*1455");
        gameApproximateHistory.add("Окончание войны Алой и Белой розы в Англии*1485");
        gameApproximateHistory.add("Начало правления Людовика XI во Франции*1461");
        gameApproximateHistory.add("Падение Византийской империи*1453");
        gameApproximateHistory.add("Начало правления Генриха VII в Англии*1485");
        gameApproximateHistory.add("Открытие Америки Христофором Колумбом*1492");
        gameApproximateHistory.add("Завершение Реконкисты на Пиренейском полуострове*1492");
        gameApproximateHistory.add("Открытие Васко да Гамой морского пути в Индию*1497");
        gameApproximateHistory.add("Выступление М. Лютера с 95 тезисами, начало Реформации в Германии*1517");
        gameApproximateHistory.add("Начало кругосветного плавания экспедиции Ф. Магеллана*1519");
        gameApproximateHistory.add("Начало крестьянской войны в Германии*1524");
        gameApproximateHistory.add("Начало Реформации в Англии*1534");
        gameApproximateHistory.add("Аугсбургский религиозный мир*1555");
        gameApproximateHistory.add("Начало религиозных войн во Франции*1562");
        gameApproximateHistory.add("Начало освободительной войны в Нидерландах*1566");
        gameApproximateHistory.add("Образование Речи Посполитой*1569");
        gameApproximateHistory.add("Варфоломеевская ночь во Франции*1572");
        gameApproximateHistory.add("Утрехтская уния*1579");
        gameApproximateHistory.add("Разгром Англией Непобедимой армады*1588");
        gameApproximateHistory.add("Нантский эдикт Генриха IV во Франции*1598");
        gameApproximateHistory.add("Начало тридцатилетней войны*1618");
        gameApproximateHistory.add("Начало деятельности кардинала Ришелье на посту первого министра Франции*1624");
        gameApproximateHistory.add("Начало деятельности Долгого парламента в Англии, начало Английской буржуазной революции*1640");
        gameApproximateHistory.add("Принятие английским парламентом «Великой ремонстрации»*1641");
        gameApproximateHistory.add("Начало гражданской войны в Англии*1642");
        gameApproximateHistory.add("Начало правления французского короля Людовика XIV*1643");
        gameApproximateHistory.add("Вестфальский мир*1648");
        gameApproximateHistory.add("Казнь английского короля Карла I*1649");
        gameApproximateHistory.add("Провозглашение Англии республикой*1650");
        gameApproximateHistory.add("Протекторат О.Кромвеля*1653");
        gameApproximateHistory.add("Реставрация династии Стюартов в Англии*1660");
        gameApproximateHistory.add("«Славная революция» в Англии*1688");
        gameApproximateHistory.add("Движение луддитов в Англии*1811 ");
        gameApproximateHistory.add("«Бостонское чаепитие»*1773");
        gameApproximateHistory.add("Принятие Декларации независимости США*1776");
        gameApproximateHistory.add("Принятие конституции США*1787");
        gameApproximateHistory.add("Начало революции во Франции*1789");
        gameApproximateHistory.add("Принятие Декларации прав человека и гражданина*1789");
        gameApproximateHistory.add("Принятие Билля «О правах» в США*1791");
        gameApproximateHistory.add("Начало президентства Дж. Вашингтона в США*1789");
        gameApproximateHistory.add("Начало революционных войн Франции*1792");
        gameApproximateHistory.add("Крушение монархии во Франции*1792");
        gameApproximateHistory.add("Приход к власти во Франции якобинцев*1793");
        gameApproximateHistory.add("Казнь короля Людовика XVI во Франции*1793");
        gameApproximateHistory.add("Начало итальянского похода Наполеона Бонапарта*1796");
        gameApproximateHistory.add("Начало египетского похода Наполеона Бонапарта*1798");
        gameApproximateHistory.add("Государственный переворот Наполеона Бонапарта*1799");
        gameApproximateHistory.add("Провозглашение Наполеона императором Франции*1804");
        gameApproximateHistory.add("Начало наполеоновских войн*1799");
        gameApproximateHistory.add("Свержение Наполеона*1814");
        gameApproximateHistory.add("«Сто дней» Наполеона*1815");
        gameApproximateHistory.add("Провозглашение доктрины Монро в США*1823");
        gameApproximateHistory.add("Революция во Франции*1830");
        gameApproximateHistory.add("Начало чартистского движения в Англии*1836");
        gameApproximateHistory.add("Начало гражданской войны в США*1861");
        gameApproximateHistory.add("Начало революции Мэйдзи в Японии*1868");
        gameApproximateHistory.add("Провозглашение Германской империи*1871");
        gameApproximateHistory.add("Создание Тройственного союза (Германия, Австро-Венгрия и Италия)*1882");
        gameApproximateHistory.add("Создание Антанты (Россия, Англия и Франция)*1907");
        gameApproximateHistory.add("Убийство наследника австрийского престола эрцгерцога Франца Фердинанда*1914");
        gameApproximateHistory.add("Начало первой мировой войны*1914");
        gameApproximateHistory.add("Окончание первой мировой войны*1918");
        gameApproximateHistory.add("Революция в Германии*1918");
        gameApproximateHistory.add("Учреждение Лиги Наций*1919");
        gameApproximateHistory.add("Приход фашистов к власти в Италии*1922");
        gameApproximateHistory.add("Начало мирового экономического кризиса, «великой депрессии»*1929");
        gameApproximateHistory.add("Приход Гитлера к власти в Германии*1933");
        gameApproximateHistory.add("Антикоминтерновский пакт Германии и Японии*1936");
        gameApproximateHistory.add("Захват Австрии нацистской Германией*1938");
        gameApproximateHistory.add("Подписание Мюнхенского соглашения*1938");
        gameApproximateHistory.add("Начало второй мировой войны*1939");
        gameApproximateHistory.add("Японская атака на Пёрл-Харбор и вступление США в войну*1941");
        gameApproximateHistory.add("Высадка англо-американских войск в Нормандии.*1944");
        gameApproximateHistory.add("Атомная бомбардировка США Хиросимы и Нагасаки*1945");
        gameApproximateHistory.add("Окончание Второй мировой войны*1945");
        gameApproximateHistory.add("Образование НАТО*1949");
        gameApproximateHistory.add("Провозглашение Китайской Народной Республики*1949");
        gameApproximateHistory.add("Победа революции на Кубе*1959");
        gameApproximateHistory.add("Окончание войны США во Вьетнаме*1973");
        gameApproximateHistory.add("Объединение ГДР и ФРГ*1990");
        Collections.shuffle(gameApproximateHistory);
    }

    public void onClickExitApproximateHistory(View view) {
        finish();
    }

    public void onClickNextApproximateHistory(View view) {
        setQuestionApproximateHistory();
    }

    public void onClickAnswerApproximateHistory(View view) {
        if (!etInputApproximateHistory.getText().toString().equals("")) {
            int rightAnswer = Integer.parseInt(gameApproximateHistory.get(0).substring(gameApproximateHistory.get(0).indexOf('*') + 1));
            int resultAnswer = Integer.parseInt(etInputApproximateHistory.getText().toString());
            int diff = Math.abs(resultAnswer - rightAnswer);
            Log.e("MyLog", "rightAnswer = " + rightAnswer);
            Log.e("MyLog", "resultAnswer = " + resultAnswer);
            Log.e("MyLog", "diff = " + diff);
            String res = String.format(getString(R.string.result_approximate_history), diff);
            if (diff == 0) {
                res = getString(R.string.right_approximate_history);
            } else {
                if (diff == 1 || (diff != 11 && diff % 10 == 1)) {
                    res = res + " " + getString(R.string.year_approximate_history);
                } else if (diff == 2 || (diff != 12 && diff % 10 == 2)) {
                    res = res + " " + getString(R.string.years_approximate_history);
                } else if (diff == 3 || (diff != 13 && diff % 10 == 3)) {
                    res = res + " " + getString(R.string.years_approximate_history);
                } else if (diff == 4 || (diff != 14 && diff % 10 == 4)) {
                    res = res + " " + getString(R.string.years_approximate_history);
                } else {
                    res = res + " " + getString(R.string.years1_approximate_history);
                }
                res += String.format(getString(R.string.result_right_answer_approximate_history), rightAnswer);
            }
            tvResultApproximateHistory.setText(res);
            gameApproximateHistory.remove(0);
            btnAnswerApproximateHistory.setEnabled(false);
            btnAnswerApproximateHistory.setBackgroundResource(R.drawable.btn_locked);
            btnNextApproximateHistory.setEnabled(true);
            btnNextApproximateHistory.setBackgroundResource(R.drawable.btn);
        }
    }

    private void setQuestionApproximateHistory() {
        if (gameApproximateHistory.isEmpty()) {
            addQuestionsApproximateHistory();
            setQuestionApproximateHistory();
        } else {
            btnNextApproximateHistory.setEnabled(false);
            btnNextApproximateHistory.setBackgroundResource(R.drawable.btn_locked);
            btnAnswerApproximateHistory.setEnabled(true);
            btnAnswerApproximateHistory.setBackgroundResource(R.drawable.btn);
            etInputApproximateHistory.setText("");
            tvResultApproximateHistory.setText(getString(R.string.spaces_approximate_history));
            String s = gameApproximateHistory.get(0).substring(0, gameApproximateHistory.get(0).indexOf('*'));
            tvQuestionApproximateHistory.setText(s);
        }
    }
}