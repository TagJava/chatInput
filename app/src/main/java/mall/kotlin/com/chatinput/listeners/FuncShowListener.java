package mall.kotlin.com.chatinput.listeners;

import java.util.ArrayList;
import java.util.List;

import mall.kotlin.com.chatinput.interfaces.FuncShowInterface;

public class FuncShowListener {
    private static List<FuncShowInterface> sFuncShowInterfaces=new ArrayList<>();

    public static List<FuncShowInterface> getsFuncShowInterfaces() {
        return sFuncShowInterfaces;
    }

    public static void addFuncShowInterface(FuncShowInterface funcShowInterface){
        sFuncShowInterfaces.add(funcShowInterface);
    }

    public static void removeFuncShowInterface(FuncShowInterface funcShowInterface){
        sFuncShowInterfaces.remove(funcShowInterface);
    }
}
