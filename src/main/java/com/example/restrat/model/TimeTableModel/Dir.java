package com.example.restrat.model.TimeTableModel;

public enum Dir {
    dep,
    arr;

    public static Dir getEnum(String str){
        // enum型全てを取得します。
        Dir[] enumArray = Dir.values();

        // 取得出来たenum型分ループします。
        for(Dir enumStr : enumArray) {
            // 引数とenum型の文字列部分を比較します。
            if (str.equals(enumStr.toString())){
                return enumStr;
            }
        }
        return null;
    }
}
