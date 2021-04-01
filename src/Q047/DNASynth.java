package Q047;

public class DNASynth {
    int aCount;
    int tCount;
    int cCount;
    int gCount;
    void setACount(int cCount){
        cCount=cCount;
    }
    void setTCount(int tCount){
        this.tCount=tCount;
    }
    int setCCount(){
        return cCount;
    }
    int setGCount(int gCount){
        gCount=g;
        return gCount;
    }

    void setAllCounts(int x){
        aCount=tCount=this.cCount=setCCount(x);
    }

}

/*
Which two methods modify field values? (Choose two.)
A. setAllCounts B. setACount C. setGCount D. setCCount E. setTCount


Answer: AC
 */
