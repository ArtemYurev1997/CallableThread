package by.pvt.callable;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class CallableClass implements Callable<List<Integer>> {
    private String name;

    public CallableClass(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public List<Integer> call() throws Exception {
        Thread.sleep(1000);
        Thread.currentThread().setName(name);
        System.out.println(Thread.currentThread().getName());
        List<Integer> numbers = new ArrayList<>();
        int sum = 0;
        for(int i = 0; i< 10; i++) {
            int num = (int) (Math.random() * 10);
            sum += num;
        }
        numbers.add(sum);
        return numbers;
    }
}
