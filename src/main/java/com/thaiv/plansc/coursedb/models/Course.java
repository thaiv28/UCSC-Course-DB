package com.thaiv.plansc.coursedb.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.ArrayList;
import java.util.Arrays;

@Entity
public class Course {

    @Id
    private String code;
    private String name;
    private String subject;
    private String num;
    private int credits;
    private String prof;
    private String genEd;
    private String repeat;
    private String quarters;
    private String preqs;
    @Column(length=1000)
    private String preqstr;

    public Course(){}

    public Course(String code){
        this.code = code;
    }

    public Course(String code, String name, String subject, String num, 
    int credits, String prof, String genEd, String repeat, String quarters, 
    String preqs, String preqstr){

        this.code = code;
        this.name = name;
        this.subject = subject;
        this.num = num;
        this.credits = credits;
        this.prof = prof;
        this.repeat = repeat;
        this.genEd = genEd;
        this.quarters = quarters;
        this.preqs = preqs;
        this.preqstr = preqstr;
        
    }

    public String toString() {
        String str = "";

        str = str.concat(subject + " " + num + " " + name);
    
        return str;
    }

    public ArrayList<String> strToArrayList(String str){
        return new ArrayList<String>(Arrays.asList(str.split(", ")));
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return this.name;
    }

    public String getSubject() {
        return this.subject;
    }

    public String getNum() {
        return this.num;
    }

    public int getCredits() {
        return this.credits;
    }

    public String getProf() {
        return this.prof;
    }

    public String getGenEd() {
        return this.genEd;
    }

    public String getRepeat() {
        return this.repeat;
    }

    public String getQuarters() {
        return this.quarters;
    }

    public String getPreqs() {
        return preqs;
    }

    public String getPreqstr() {
        return this.preqstr;
    }

    public void setPreqstr(String preqstr){
        this.preqstr = preqstr;
    }

    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((code == null) ? 0 : code.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((subject == null) ? 0 : subject.hashCode());
        result = prime * result + ((num == null) ? 0 : num.hashCode());
        result = prime * result + credits;
        result = prime * result + ((prof == null) ? 0 : prof.hashCode());
        result = prime * result + ((genEd == null) ? 0 : genEd.hashCode());
        result = prime * result + ((repeat == null) ? 0 : repeat.hashCode());
        result = prime * result + ((quarters == null) ? 0 : quarters.hashCode());
        result = prime * result + ((preqs == null) ? 0 : preqs.hashCode());
        result = prime * result + ((preqstr == null) ? 0 : preqstr.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Course other = (Course) obj;
        if (code == null) {
            if (other.code != null)
                return false;
        } else if (!code.equals(other.code))
            return true;
        return false;
    }
}