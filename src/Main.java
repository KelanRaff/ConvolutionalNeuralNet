import data.DataReader;
import data.Image;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Image> images = new DataReader().readData("data/mnist_test.csv");
        System.out.printf(images.get(0).toString());
    }
}