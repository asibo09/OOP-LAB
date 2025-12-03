class ComplexNumCalculator {
    int nOpDone;
    ComplexNum lastRes;

    void build(int n, ComplexNum c){
        this.nOpDone=n;
        this.lastRes.re=c.re;
        this.lastRes.im=c.im;
    }

    ComplexNum add(ComplexNum n1, ComplexNum n2){
        n1.re+=n2.re;
        n1.im+=n2.im;
        return n1;
    }
    ComplexNum sub(ComplexNum n1, ComplexNum n2){
        n1.re-=n2.re;
        n1.im-=n2.im;
        return n1;
    }
    ComplexNum mul(ComplexNum n1, ComplexNum n2){

        n1.re=n1.re*n2.re - n1.im*n2.im;
        n1.im= n1.im*n2.re + n1.re*n2.im;
        return n1;
    }
    ComplexNum div(ComplexNum n1, ComplexNum n2){
        n1.re= (n1.re*n2.re + n1.im*n2.im)/(n2.re*n2.re + n2.im*n2.im);
        n1.im= (n1.im*n2.re - n1.re*n2.im)/(n2.re*n2.re + n2.im*n2.im);
        return n1;
    }
}
