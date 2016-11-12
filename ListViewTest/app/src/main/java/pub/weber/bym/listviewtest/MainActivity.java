package pub.weber.bym.listviewtest;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {

//    private String [] data = {"苹果", "香蕉", "橘子", "西瓜","荔枝", "李子", "猕猴桃", "枣", "樱桃",
//            "芒果", "香蕉", "橘子", "西瓜","荔枝", "李子", "猕猴桃", "枣", "樱桃", "芒果"};
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,data);
//        ListView listView = (ListView) findViewById(R.id.list_view);
//        listView.setAdapter(adapter);
//    }

    private List<Fruit> fruitList = new ArrayList<Fruit>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initFruits();
        FruitAdapter adapter = new FruitAdapter(MainActivity.this,R.layout.fruit_item,fruitList);
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
    private void initFruits(){
        Fruit apple = new Fruit("Apple",R.drawable.apple);
        fruitList.add(apple);
        Fruit banana = new Fruit("Banana", R.drawable.banana);
        fruitList.add(banana);
        Fruit apple1 = new Fruit("Apple",R.drawable.apple);
        fruitList.add(apple1);
        Fruit banana1 = new Fruit("Banana", R.drawable.banana);
        fruitList.add(banana1);
        Fruit apple2 = new Fruit("Apple",R.drawable.apple);
        fruitList.add(apple2);
        Fruit banana2 = new Fruit("Banana", R.drawable.banana);
        fruitList.add(banana2);
        Fruit apple3 = new Fruit("Apple",R.drawable.apple);
        fruitList.add(apple3);
        Fruit banana3 = new Fruit("Banana", R.drawable.banana);
        fruitList.add(banana3);
        Fruit apple4 = new Fruit("Apple",R.drawable.apple);
        fruitList.add(apple4);
        Fruit banana4 = new Fruit("Banana", R.drawable.banana);
        fruitList.add(banana4);
        Fruit apple5 = new Fruit("Apple",R.drawable.apple);
        fruitList.add(apple5);
        Fruit banana5 = new Fruit("Banana", R.drawable.banana);
        fruitList.add(banana5);
        Fruit apple6 = new Fruit("Apple",R.drawable.apple);
        fruitList.add(apple6);
        Fruit banana6 = new Fruit("Banana", R.drawable.banana);
        fruitList.add(banana6);
        Fruit apple7 = new Fruit("Apple",R.drawable.apple);
        fruitList.add(apple7);
        Fruit banana7 = new Fruit("Banana", R.drawable.banana);
        fruitList.add(banana7);
        Fruit apple8 = new Fruit("Apple",R.drawable.apple);
        fruitList.add(apple8);
        Fruit banana8 = new Fruit("Banana", R.drawable.banana);
        fruitList.add(banana8);
        Fruit apple9 = new Fruit("Apple",R.drawable.apple);
        fruitList.add(apple9);
        Fruit banana9 = new Fruit("Banana", R.drawable.banana);
        fruitList.add(banana9);
    }
}
