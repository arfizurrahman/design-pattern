package com.arfiz.SOLIDDesignPriciple.dependencyInversionPriciple;

import java.util.List;

public class Project {
//    private BackEndDeveloper backEndDeveloper = new BackEndDeveloper();
//    private FrontEndDeveloper frontEndDeveloper = new FrontEndDeveloper();
//    public void implement() {
//        backEndDeveloper.writeCSharp();
//        frontEndDeveloper.writeJavaScript();
//    }

    private List<Developer> developers;
    public Project(List<Developer> developers) {
        this.developers = developers;
    }
    public void implement() {
        developers.forEach(d->d.develop());
    }

}
