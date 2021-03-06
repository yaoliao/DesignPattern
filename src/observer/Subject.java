package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象主题角色类
 */
public abstract class Subject{
    /**
     * 用来保存注册的观察者对象
     */
    private List<Observer> list = new ArrayList<Observer>();

    /**
     * 注册观察者对象
     * @param observer 观察者对象
     */
    public void attach(Observer observer){

        list.add(observer);
        System.out.println("Attached an observer ---- 添加一个观察者");
    }

    /**
     * 删除观察者对象
     * @param observer 观察者对象
     */
    public void delete(Observer observer){

        int i = list.indexOf(observer);
        if(i >= 0){
            list.remove(observer);
            System.out.println("delete an observer ---- 删除一个观察者");
        }
    }

    /**
     * 通知所有注册的观察者对象
     * @param newState
     */
    public void nodifyObservers(String newState){

        for(Observer observer : list){
            observer.update(newState);
        }
    }
}
