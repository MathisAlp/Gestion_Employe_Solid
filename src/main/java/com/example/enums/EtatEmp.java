package com.example.enums;

public enum EtatEmp {
    Conge,
    Malade,
    Absent;

    public static EtatEmp getValue(int index) {
        return EtatEmp.values()[index-1];
    }

}
