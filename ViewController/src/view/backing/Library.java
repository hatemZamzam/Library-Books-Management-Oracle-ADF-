package view.backing;

import oracle.adf.view.rich.component.rich.RichDocument;
import oracle.adf.view.rich.component.rich.RichForm;
import oracle.adf.view.rich.component.rich.RichPanelWindow;
import oracle.adf.view.rich.component.rich.RichPopup;
import oracle.adf.view.rich.component.rich.RichQuery;
import oracle.adf.view.rich.component.rich.data.RichTable;
import oracle.adf.view.rich.component.rich.input.RichInputDate;
import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.component.rich.layout.RichPanelAccordion;
import oracle.adf.view.rich.component.rich.layout.RichPanelBox;
import oracle.adf.view.rich.component.rich.layout.RichPanelDashboard;
import oracle.adf.view.rich.component.rich.layout.RichPanelFormLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelGroupLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelHeader;
import oracle.adf.view.rich.component.rich.layout.RichPanelSplitter;
import oracle.adf.view.rich.component.rich.layout.RichPanelStretchLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelTabbed;
import oracle.adf.view.rich.component.rich.layout.RichShowDetailItem;
import oracle.adf.view.rich.component.rich.nav.RichCommandButton;
import oracle.adf.view.rich.component.rich.output.RichImage;
import oracle.adf.view.rich.component.rich.output.RichMessages;
import oracle.adf.view.rich.component.rich.output.RichOutputText;
import oracle.adf.view.rich.component.rich.output.RichSpacer;

import org.apache.myfaces.trinidad.component.UIXGroup;

public class Library {
    private RichForm f1;
    private RichDocument d1;
    private RichPanelTabbed pt1;
    private RichShowDetailItem sdi3;
    private RichShowDetailItem sdi4;
    private RichPanelBox pb1;
    private RichMessages m1;
    private RichTable t1;
    private RichPanelDashboard pd3;
    private RichPanelDashboard pd4;
    private RichPanelBox pb5;
    private RichPanelBox pb6;
    private RichTable t5;
    private RichTable t6;
    private RichPanelGroupLayout pgl1;
    private RichPanelHeader ph1;
    private RichQuery qryId1;
    private RichPanelBox pb7;
    private RichPanelBox pb8;
    private RichPanelHeader ph2;
    private RichQuery qryId2;
    private RichTable t7;
    private RichTable t8;
    private RichPanelGroupLayout pgl3;
    private RichPanelHeader ph3;
    private RichQuery qryId3;
    private RichPanelBox pb9;
    private RichPanelBox pb10;
    private RichTable t9;
    private RichInputDate id3;
    private RichInputDate id4;
    private RichTable t10;
    private RichPanelGroupLayout pgl4;
    private RichPanelHeader ph4;
    private RichQuery qryId4;
    private RichShowDetailItem sdi5;
    private RichPanelSplitter ps5;
    private RichPanelGroupLayout pgl6;
    private RichPanelHeader ph5;
    private RichQuery q1;
    private RichPanelDashboard pd5;
    private RichPanelBox pb2;
    private RichTable t2;
    private RichShowDetailItem sdi6;
    private RichPanelSplitter ps6;
    private RichPanelGroupLayout pgl7;
    private RichPanelHeader ph6;
    private RichQuery q2;
    private RichPanelDashboard pd6;
    private RichPanelBox pb3;
    private RichTable t3;
    private RichPanelBox pb4;
    private RichTable t4;
    private RichShowDetailItem sdi7;
    private RichPanelSplitter ps7;
    private RichPanelGroupLayout pgl8;
    private RichPanelHeader ph7;
    private RichQuery q3;
    private RichPanelDashboard pd7;
    private RichPanelBox pb11;
    private RichTable t11;
    private RichPanelBox pb12;
    private RichTable t12;
    private RichShowDetailItem sdi8;
    private RichPanelSplitter ps8;
    private RichPanelGroupLayout pgl9;
    private RichPanelHeader ph8;
    private RichQuery q4;
    private RichPanelDashboard pd8;
    private RichPanelBox pb13;
    private RichTable t13;
    private RichInputDate id1;
    private RichInputDate id2;
    private RichPanelBox pb14;
    private RichTable t14;
    private RichPopup p1;
    private RichPanelWindow pw1;
    private RichPanelFormLayout pfl1;
    private RichInputText it2;
    private RichInputText it3;
    private RichInputText it4;
    private RichInputText it5;
    private RichSpacer s1;
    private RichPanelWindow pw2;
    private RichCommandButton cb13;
    private RichPopup p2;
    private RichPopup p3;
    private RichPopup p4;
    private RichPopup p5;
    private RichPopup p6;
    private RichPopup p7;
    private RichInputText it1;
    private RichPanelGroupLayout pgl2;
    private RichCommandButton cb11;
    private RichCommandButton cb16;
    private RichCommandButton cb10;
    private RichCommandButton cb12;
    private RichCommandButton cb15;
    private RichPanelWindow pw3;
    private RichPanelFormLayout pfl3;
    private RichInputText it6;
    private RichInputText it11;
    private RichInputText it12;
    private RichCommandButton cb17;
    private UIXGroup g1;
    private RichCommandButton cb18;
    private RichPanelGroupLayout pgl5;
    private RichCommandButton cb19;
    private RichCommandButton cb20;
    private RichCommandButton cb21;
    private RichPanelWindow pw4;
    private RichPanelFormLayout pfl4;
    private RichInputText it13;
    private RichInputText it14;
    private RichInputText it15;
    private RichInputText it16;
    private RichInputText it17;
    private RichInputText it18;
    private RichInputText it19;
    private RichCommandButton cb22;
    private UIXGroup g2;
    private RichPanelGroupLayout pgl10;
    private RichCommandButton cb23;
    private RichPanelGroupLayout pgl11;
    private RichCommandButton cb24;
    private RichCommandButton cb25;
    private RichCommandButton cb26;
    private RichPanelFormLayout pfl2;
    private RichInputText it7;
    private RichInputText it8;
    private RichInputText it9;
    private RichInputText it10;
    private RichCommandButton cb8;
    private UIXGroup g3;
    private RichPanelGroupLayout pgl12;
    private RichCommandButton cb9;
    private RichCommandButton cb14;
    private RichCommandButton cb27;
    private RichPanelGroupLayout pgl13;
    private RichCommandButton cb28;
    private RichCommandButton cb29;
    private RichCommandButton cb30;
    private RichPanelWindow pw5;
    private RichPanelFormLayout pfl5;
    private RichInputText it20;
    private RichInputText it21;
    private RichInputText it22;
    private RichInputText it23;
    private RichInputText it24;
    private RichInputText it25;
    private RichInputText it26;
    private RichCommandButton cb31;
    private UIXGroup g4;
    private RichPanelGroupLayout pgl14;
    private RichCommandButton cb32;
    private RichPanelWindow pw6;
    private RichPanelFormLayout pfl6;
    private RichInputText it27;
    private RichInputText it28;
    private RichInputText it29;
    private RichInputText it30;
    private RichInputText it31;
    private RichInputText it32;
    private RichInputText it33;
    private RichCommandButton cb33;
    private UIXGroup g5;
    private RichPanelGroupLayout pgl15;
    private RichCommandButton cb34;
    private RichPanelGroupLayout pgl16;
    private RichCommandButton cb35;
    private RichCommandButton cb36;
    private RichCommandButton cb37;
    private RichPanelWindow pw7;
    private RichPanelFormLayout pfl7;
    private RichInputText it34;
    private RichInputText it35;
    private RichInputText it36;
    private RichInputText it37;
    private RichInputText it38;
    private RichInputText it39;
    private RichInputText it40;
    private RichCommandButton cb38;
    private UIXGroup g6;
    private RichCommandButton cb39;
    private RichPanelGroupLayout pgl17;
    private RichPanelGroupLayout pgl18;
    private RichCommandButton cb40;
    private RichCommandButton cb41;
    private RichCommandButton cb42;
    private RichOutputText ot6;
    private RichPanelGroupLayout pgl19;
    private RichOutputText ot7;
    private RichPanelSplitter ps3;
    private RichPanelGroupLayout pgl21;
    private RichOutputText ot9;
    private RichPanelGroupLayout pgl20;
    private RichOutputText ot11;
    private RichOutputText ot12;
    private RichOutputText ot13;
    private RichOutputText ot14;
    private RichOutputText ot15;
    private RichImage i1;
    private RichPanelGroupLayout pgl22;
    private RichSpacer s2;
    private RichPanelStretchLayout psl1;
    private RichImage i2;
    private RichPanelGroupLayout pgl23;
    private RichPanelAccordion pa1;
    private RichShowDetailItem sdi1;
    private RichPanelAccordion pa2;
    private RichShowDetailItem sdi2;
    private RichImage i3;
    private RichSpacer s3;
    private RichSpacer s4;
    private RichOutputText ot8;

    public void setF1(RichForm f1) {
        this.f1 = f1;
    }

    public RichForm getF1() {
        return f1;
    }

    public void setD1(RichDocument d1) {
        this.d1 = d1;
    }

    public RichDocument getD1() {
        return d1;
    }


    public void setPt1(RichPanelTabbed pt1) {
        this.pt1 = pt1;
    }

    public RichPanelTabbed getPt1() {
        return pt1;
    }


    public void setSdi3(RichShowDetailItem sdi3) {
        this.sdi3 = sdi3;
    }

    public RichShowDetailItem getSdi3() {
        return sdi3;
    }

    public void setSdi4(RichShowDetailItem sdi4) {
        this.sdi4 = sdi4;
    }

    public RichShowDetailItem getSdi4() {
        return sdi4;
    }


    public void setPb1(RichPanelBox pb1) {
        this.pb1 = pb1;
    }

    public RichPanelBox getPb1() {
        return pb1;
    }


    public void setM1(RichMessages m1) {
        this.m1 = m1;
    }

    public RichMessages getM1() {
        return m1;
    }

    public void setT1(RichTable t1) {
        this.t1 = t1;
    }

    public RichTable getT1() {
        return t1;
    }


    public void setPd3(RichPanelDashboard pd3) {
        this.pd3 = pd3;
    }

    public RichPanelDashboard getPd3() {
        return pd3;
    }

    public void setPd4(RichPanelDashboard pd4) {
        this.pd4 = pd4;
    }

    public RichPanelDashboard getPd4() {
        return pd4;
    }

    public void setPb5(RichPanelBox pb5) {
        this.pb5 = pb5;
    }

    public RichPanelBox getPb5() {
        return pb5;
    }

    public void setPb6(RichPanelBox pb6) {
        this.pb6 = pb6;
    }

    public RichPanelBox getPb6() {
        return pb6;
    }

    public void setT5(RichTable t5) {
        this.t5 = t5;
    }

    public RichTable getT5() {
        return t5;
    }

    public void setT6(RichTable t6) {
        this.t6 = t6;
    }

    public RichTable getT6() {
        return t6;
    }

    public void setPgl1(RichPanelGroupLayout pgl1) {
        this.pgl1 = pgl1;
    }

    public RichPanelGroupLayout getPgl1() {
        return pgl1;
    }

    public void setPh1(RichPanelHeader ph1) {
        this.ph1 = ph1;
    }

    public RichPanelHeader getPh1() {
        return ph1;
    }

    public void setQryId1(RichQuery qryId1) {
        this.qryId1 = qryId1;
    }

    public RichQuery getQryId1() {
        return qryId1;
    }

    public void setPb7(RichPanelBox pb7) {
        this.pb7 = pb7;
    }

    public RichPanelBox getPb7() {
        return pb7;
    }

    public void setPb8(RichPanelBox pb8) {
        this.pb8 = pb8;
    }

    public RichPanelBox getPb8() {
        return pb8;
    }


    public void setPh2(RichPanelHeader ph2) {
        this.ph2 = ph2;
    }

    public RichPanelHeader getPh2() {
        return ph2;
    }

    public void setQryId2(RichQuery qryId2) {
        this.qryId2 = qryId2;
    }

    public RichQuery getQryId2() {
        return qryId2;
    }

    public void setT7(RichTable t7) {
        this.t7 = t7;
    }

    public RichTable getT7() {
        return t7;
    }

    public void setT8(RichTable t8) {
        this.t8 = t8;
    }

    public RichTable getT8() {
        return t8;
    }

    public void setPgl3(RichPanelGroupLayout pgl3) {
        this.pgl3 = pgl3;
    }

    public RichPanelGroupLayout getPgl3() {
        return pgl3;
    }

    public void setPh3(RichPanelHeader ph3) {
        this.ph3 = ph3;
    }

    public RichPanelHeader getPh3() {
        return ph3;
    }

    public void setQryId3(RichQuery qryId3) {
        this.qryId3 = qryId3;
    }

    public RichQuery getQryId3() {
        return qryId3;
    }

    public void setPb9(RichPanelBox pb9) {
        this.pb9 = pb9;
    }

    public RichPanelBox getPb9() {
        return pb9;
    }

    public void setPb10(RichPanelBox pb10) {
        this.pb10 = pb10;
    }

    public RichPanelBox getPb10() {
        return pb10;
    }

    public void setT9(RichTable t9) {
        this.t9 = t9;
    }

    public RichTable getT9() {
        return t9;
    }

    public void setId3(RichInputDate id3) {
        this.id3 = id3;
    }

    public RichInputDate getId3() {
        return id3;
    }

    public void setId4(RichInputDate id4) {
        this.id4 = id4;
    }

    public RichInputDate getId4() {
        return id4;
    }

    public void setT10(RichTable t10) {
        this.t10 = t10;
    }

    public RichTable getT10() {
        return t10;
    }

    public void setPgl4(RichPanelGroupLayout pgl4) {
        this.pgl4 = pgl4;
    }

    public RichPanelGroupLayout getPgl4() {
        return pgl4;
    }

    public void setPh4(RichPanelHeader ph4) {
        this.ph4 = ph4;
    }

    public RichPanelHeader getPh4() {
        return ph4;
    }


    public void setQryId4(RichQuery qryId4) {
        this.qryId4 = qryId4;
    }

    public RichQuery getQryId4() {
        return qryId4;
    }


    public void setSdi5(RichShowDetailItem sdi5) {
        this.sdi5 = sdi5;
    }

    public RichShowDetailItem getSdi5() {
        return sdi5;
    }

    public void setPs5(RichPanelSplitter ps5) {
        this.ps5 = ps5;
    }

    public RichPanelSplitter getPs5() {
        return ps5;
    }

    public void setPgl6(RichPanelGroupLayout pgl6) {
        this.pgl6 = pgl6;
    }

    public RichPanelGroupLayout getPgl6() {
        return pgl6;
    }

    public void setPh5(RichPanelHeader ph5) {
        this.ph5 = ph5;
    }

    public RichPanelHeader getPh5() {
        return ph5;
    }

    public void setQ1(RichQuery q1) {
        this.q1 = q1;
    }

    public RichQuery getQ1() {
        return q1;
    }

    public void setPd5(RichPanelDashboard pd5) {
        this.pd5 = pd5;
    }

    public RichPanelDashboard getPd5() {
        return pd5;
    }

    public void setPb2(RichPanelBox pb2) {
        this.pb2 = pb2;
    }

    public RichPanelBox getPb2() {
        return pb2;
    }

    public void setT2(RichTable t2) {
        this.t2 = t2;
    }

    public RichTable getT2() {
        return t2;
    }

    public void setSdi6(RichShowDetailItem sdi6) {
        this.sdi6 = sdi6;
    }

    public RichShowDetailItem getSdi6() {
        return sdi6;
    }

    public void setPs6(RichPanelSplitter ps6) {
        this.ps6 = ps6;
    }

    public RichPanelSplitter getPs6() {
        return ps6;
    }

    public void setPgl7(RichPanelGroupLayout pgl7) {
        this.pgl7 = pgl7;
    }

    public RichPanelGroupLayout getPgl7() {
        return pgl7;
    }

    public void setPh6(RichPanelHeader ph6) {
        this.ph6 = ph6;
    }

    public RichPanelHeader getPh6() {
        return ph6;
    }

    public void setQ2(RichQuery q2) {
        this.q2 = q2;
    }

    public RichQuery getQ2() {
        return q2;
    }

    public void setPd6(RichPanelDashboard pd6) {
        this.pd6 = pd6;
    }

    public RichPanelDashboard getPd6() {
        return pd6;
    }

    public void setPb3(RichPanelBox pb3) {
        this.pb3 = pb3;
    }

    public RichPanelBox getPb3() {
        return pb3;
    }

    public void setT3(RichTable t3) {
        this.t3 = t3;
    }

    public RichTable getT3() {
        return t3;
    }

    public void setPb4(RichPanelBox pb4) {
        this.pb4 = pb4;
    }

    public RichPanelBox getPb4() {
        return pb4;
    }

    public void setT4(RichTable t4) {
        this.t4 = t4;
    }

    public RichTable getT4() {
        return t4;
    }

    public void setSdi7(RichShowDetailItem sdi7) {
        this.sdi7 = sdi7;
    }

    public RichShowDetailItem getSdi7() {
        return sdi7;
    }

    public void setPs7(RichPanelSplitter ps7) {
        this.ps7 = ps7;
    }

    public RichPanelSplitter getPs7() {
        return ps7;
    }

    public void setPgl8(RichPanelGroupLayout pgl8) {
        this.pgl8 = pgl8;
    }

    public RichPanelGroupLayout getPgl8() {
        return pgl8;
    }

    public void setPh7(RichPanelHeader ph7) {
        this.ph7 = ph7;
    }

    public RichPanelHeader getPh7() {
        return ph7;
    }

    public void setQ3(RichQuery q3) {
        this.q3 = q3;
    }

    public RichQuery getQ3() {
        return q3;
    }

    public void setPd7(RichPanelDashboard pd7) {
        this.pd7 = pd7;
    }

    public RichPanelDashboard getPd7() {
        return pd7;
    }

    public void setPb11(RichPanelBox pb11) {
        this.pb11 = pb11;
    }

    public RichPanelBox getPb11() {
        return pb11;
    }

    public void setT11(RichTable t11) {
        this.t11 = t11;
    }

    public RichTable getT11() {
        return t11;
    }

    public void setPb12(RichPanelBox pb12) {
        this.pb12 = pb12;
    }

    public RichPanelBox getPb12() {
        return pb12;
    }

    public void setT12(RichTable t12) {
        this.t12 = t12;
    }

    public RichTable getT12() {
        return t12;
    }

    public void setSdi8(RichShowDetailItem sdi8) {
        this.sdi8 = sdi8;
    }

    public RichShowDetailItem getSdi8() {
        return sdi8;
    }

    public void setPs8(RichPanelSplitter ps8) {
        this.ps8 = ps8;
    }

    public RichPanelSplitter getPs8() {
        return ps8;
    }

    public void setPgl9(RichPanelGroupLayout pgl9) {
        this.pgl9 = pgl9;
    }

    public RichPanelGroupLayout getPgl9() {
        return pgl9;
    }

    public void setPh8(RichPanelHeader ph8) {
        this.ph8 = ph8;
    }

    public RichPanelHeader getPh8() {
        return ph8;
    }

    public void setQ4(RichQuery q4) {
        this.q4 = q4;
    }

    public RichQuery getQ4() {
        return q4;
    }

    public void setPd8(RichPanelDashboard pd8) {
        this.pd8 = pd8;
    }

    public RichPanelDashboard getPd8() {
        return pd8;
    }

    public void setPb13(RichPanelBox pb13) {
        this.pb13 = pb13;
    }

    public RichPanelBox getPb13() {
        return pb13;
    }

    public void setT13(RichTable t13) {
        this.t13 = t13;
    }

    public RichTable getT13() {
        return t13;
    }

    public void setId1(RichInputDate id1) {
        this.id1 = id1;
    }

    public RichInputDate getId1() {
        return id1;
    }

    public void setId2(RichInputDate id2) {
        this.id2 = id2;
    }

    public RichInputDate getId2() {
        return id2;
    }

    public void setPb14(RichPanelBox pb14) {
        this.pb14 = pb14;
    }

    public RichPanelBox getPb14() {
        return pb14;
    }

    public void setT14(RichTable t14) {
        this.t14 = t14;
    }

    public RichTable getT14() {
        return t14;
    }

    public void setP1(RichPopup p1) {
        this.p1 = p1;
    }

    public RichPopup getP1() {
        return p1;
    }

    public void setPw1(RichPanelWindow pw1) {
        this.pw1 = pw1;
    }

    public RichPanelWindow getPw1() {
        return pw1;
    }

    public void setPfl1(RichPanelFormLayout pfl1) {
        this.pfl1 = pfl1;
    }

    public RichPanelFormLayout getPfl1() {
        return pfl1;
    }


    public void setIt2(RichInputText it2) {
        this.it2 = it2;
    }

    public RichInputText getIt2() {
        return it2;
    }

    public void setIt3(RichInputText it3) {
        this.it3 = it3;
    }

    public RichInputText getIt3() {
        return it3;
    }

    public void setIt4(RichInputText it4) {
        this.it4 = it4;
    }

    public RichInputText getIt4() {
        return it4;
    }

    public void setIt5(RichInputText it5) {
        this.it5 = it5;
    }

    public RichInputText getIt5() {
        return it5;
    }


    public void setS1(RichSpacer s1) {
        this.s1 = s1;
    }

    public RichSpacer getS1() {
        return s1;
    }


    public void setPw2(RichPanelWindow pw2) {
        this.pw2 = pw2;
    }

    public RichPanelWindow getPw2() {
        return pw2;
    }


    public void setCb13(RichCommandButton cb13) {
        this.cb13 = cb13;
    }

    public RichCommandButton getCb13() {
        return cb13;
    }


    public void setP2(RichPopup p2) {
        this.p2 = p2;
    }

    public RichPopup getP2() {
        return p2;
    }

    public void setP3(RichPopup p3) {
        this.p3 = p3;
    }

    public RichPopup getP3() {
        return p3;
    }

    public void setP4(RichPopup p4) {
        this.p4 = p4;
    }

    public RichPopup getP4() {
        return p4;
    }

    public void setP5(RichPopup p5) {
        this.p5 = p5;
    }

    public RichPopup getP5() {
        return p5;
    }

    public void setP6(RichPopup p6) {
        this.p6 = p6;
    }

    public RichPopup getP6() {
        return p6;
    }

    public void setP7(RichPopup p7) {
        this.p7 = p7;
    }

    public RichPopup getP7() {
        return p7;
    }


    public void setIt1(RichInputText it1) {
        this.it1 = it1;
    }

    public RichInputText getIt1() {
        return it1;
    }

    public void setPgl2(RichPanelGroupLayout pgl2) {
        this.pgl2 = pgl2;
    }

    public RichPanelGroupLayout getPgl2() {
        return pgl2;
    }


    public void setCb11(RichCommandButton cb11) {
        this.cb11 = cb11;
    }

    public RichCommandButton getCb11() {
        return cb11;
    }


    public void setCb16(RichCommandButton cb16) {
        this.cb16 = cb16;
    }

    public RichCommandButton getCb16() {
        return cb16;
    }

    public void setCb10(RichCommandButton cb10) {
        this.cb10 = cb10;
    }

    public RichCommandButton getCb10() {
        return cb10;
    }

    public void setCb12(RichCommandButton cb12) {
        this.cb12 = cb12;
    }

    public RichCommandButton getCb12() {
        return cb12;
    }

    public void setCb15(RichCommandButton cb15) {
        this.cb15 = cb15;
    }

    public RichCommandButton getCb15() {
        return cb15;
    }

    public void setPw3(RichPanelWindow pw3) {
        this.pw3 = pw3;
    }

    public RichPanelWindow getPw3() {
        return pw3;
    }

    public void setPfl3(RichPanelFormLayout pfl3) {
        this.pfl3 = pfl3;
    }

    public RichPanelFormLayout getPfl3() {
        return pfl3;
    }

    public void setIt6(RichInputText it6) {
        this.it6 = it6;
    }

    public RichInputText getIt6() {
        return it6;
    }

    public void setIt11(RichInputText it11) {
        this.it11 = it11;
    }

    public RichInputText getIt11() {
        return it11;
    }

    public void setIt12(RichInputText it12) {
        this.it12 = it12;
    }

    public RichInputText getIt12() {
        return it12;
    }

    public void setCb17(RichCommandButton cb17) {
        this.cb17 = cb17;
    }

    public RichCommandButton getCb17() {
        return cb17;
    }

    public void setG1(UIXGroup g1) {
        this.g1 = g1;
    }

    public UIXGroup getG1() {
        return g1;
    }

    public void setCb18(RichCommandButton cb18) {
        this.cb18 = cb18;
    }

    public RichCommandButton getCb18() {
        return cb18;
    }

    public void setPgl5(RichPanelGroupLayout pgl5) {
        this.pgl5 = pgl5;
    }

    public RichPanelGroupLayout getPgl5() {
        return pgl5;
    }

    public void setCb19(RichCommandButton cb19) {
        this.cb19 = cb19;
    }

    public RichCommandButton getCb19() {
        return cb19;
    }

    public void setCb20(RichCommandButton cb20) {
        this.cb20 = cb20;
    }

    public RichCommandButton getCb20() {
        return cb20;
    }

    public void setCb21(RichCommandButton cb21) {
        this.cb21 = cb21;
    }

    public RichCommandButton getCb21() {
        return cb21;
    }

    public void setPw4(RichPanelWindow pw4) {
        this.pw4 = pw4;
    }

    public RichPanelWindow getPw4() {
        return pw4;
    }

    public void setPfl4(RichPanelFormLayout pfl4) {
        this.pfl4 = pfl4;
    }

    public RichPanelFormLayout getPfl4() {
        return pfl4;
    }

    public void setIt13(RichInputText it13) {
        this.it13 = it13;
    }

    public RichInputText getIt13() {
        return it13;
    }

    public void setIt14(RichInputText it14) {
        this.it14 = it14;
    }

    public RichInputText getIt14() {
        return it14;
    }

    public void setIt15(RichInputText it15) {
        this.it15 = it15;
    }

    public RichInputText getIt15() {
        return it15;
    }

    public void setIt16(RichInputText it16) {
        this.it16 = it16;
    }

    public RichInputText getIt16() {
        return it16;
    }

    public void setIt17(RichInputText it17) {
        this.it17 = it17;
    }

    public RichInputText getIt17() {
        return it17;
    }

    public void setIt18(RichInputText it18) {
        this.it18 = it18;
    }

    public RichInputText getIt18() {
        return it18;
    }

    public void setIt19(RichInputText it19) {
        this.it19 = it19;
    }

    public RichInputText getIt19() {
        return it19;
    }

    public void setCb22(RichCommandButton cb22) {
        this.cb22 = cb22;
    }

    public RichCommandButton getCb22() {
        return cb22;
    }

    public void setG2(UIXGroup g2) {
        this.g2 = g2;
    }

    public UIXGroup getG2() {
        return g2;
    }

    public void setPgl10(RichPanelGroupLayout pgl10) {
        this.pgl10 = pgl10;
    }

    public RichPanelGroupLayout getPgl10() {
        return pgl10;
    }

    public void setCb23(RichCommandButton cb23) {
        this.cb23 = cb23;
    }

    public RichCommandButton getCb23() {
        return cb23;
    }

    public void setPgl11(RichPanelGroupLayout pgl11) {
        this.pgl11 = pgl11;
    }

    public RichPanelGroupLayout getPgl11() {
        return pgl11;
    }

    public void setCb24(RichCommandButton cb24) {
        this.cb24 = cb24;
    }

    public RichCommandButton getCb24() {
        return cb24;
    }

    public void setCb25(RichCommandButton cb25) {
        this.cb25 = cb25;
    }

    public RichCommandButton getCb25() {
        return cb25;
    }

    public void setCb26(RichCommandButton cb26) {
        this.cb26 = cb26;
    }

    public RichCommandButton getCb26() {
        return cb26;
    }

    public void setPfl2(RichPanelFormLayout pfl2) {
        this.pfl2 = pfl2;
    }

    public RichPanelFormLayout getPfl2() {
        return pfl2;
    }

    public void setIt7(RichInputText it7) {
        this.it7 = it7;
    }

    public RichInputText getIt7() {
        return it7;
    }

    public void setIt8(RichInputText it8) {
        this.it8 = it8;
    }

    public RichInputText getIt8() {
        return it8;
    }

    public void setIt9(RichInputText it9) {
        this.it9 = it9;
    }

    public RichInputText getIt9() {
        return it9;
    }

    public void setIt10(RichInputText it10) {
        this.it10 = it10;
    }

    public RichInputText getIt10() {
        return it10;
    }

    public void setCb8(RichCommandButton cb8) {
        this.cb8 = cb8;
    }

    public RichCommandButton getCb8() {
        return cb8;
    }

    public void setG3(UIXGroup g3) {
        this.g3 = g3;
    }

    public UIXGroup getG3() {
        return g3;
    }

    public void setPgl12(RichPanelGroupLayout pgl12) {
        this.pgl12 = pgl12;
    }

    public RichPanelGroupLayout getPgl12() {
        return pgl12;
    }

    public void setCb9(RichCommandButton cb9) {
        this.cb9 = cb9;
    }

    public RichCommandButton getCb9() {
        return cb9;
    }

    public void setCb14(RichCommandButton cb14) {
        this.cb14 = cb14;
    }

    public RichCommandButton getCb14() {
        return cb14;
    }

    public void setCb27(RichCommandButton cb27) {
        this.cb27 = cb27;
    }

    public RichCommandButton getCb27() {
        return cb27;
    }

    public void setPgl13(RichPanelGroupLayout pgl13) {
        this.pgl13 = pgl13;
    }

    public RichPanelGroupLayout getPgl13() {
        return pgl13;
    }

    public void setCb28(RichCommandButton cb28) {
        this.cb28 = cb28;
    }

    public RichCommandButton getCb28() {
        return cb28;
    }

    public void setCb29(RichCommandButton cb29) {
        this.cb29 = cb29;
    }

    public RichCommandButton getCb29() {
        return cb29;
    }

    public void setCb30(RichCommandButton cb30) {
        this.cb30 = cb30;
    }

    public RichCommandButton getCb30() {
        return cb30;
    }

    public void setPw5(RichPanelWindow pw5) {
        this.pw5 = pw5;
    }

    public RichPanelWindow getPw5() {
        return pw5;
    }

    public void setPfl5(RichPanelFormLayout pfl5) {
        this.pfl5 = pfl5;
    }

    public RichPanelFormLayout getPfl5() {
        return pfl5;
    }

    public void setIt20(RichInputText it20) {
        this.it20 = it20;
    }

    public RichInputText getIt20() {
        return it20;
    }

    public void setIt21(RichInputText it21) {
        this.it21 = it21;
    }

    public RichInputText getIt21() {
        return it21;
    }

    public void setIt22(RichInputText it22) {
        this.it22 = it22;
    }

    public RichInputText getIt22() {
        return it22;
    }

    public void setIt23(RichInputText it23) {
        this.it23 = it23;
    }

    public RichInputText getIt23() {
        return it23;
    }

    public void setIt24(RichInputText it24) {
        this.it24 = it24;
    }

    public RichInputText getIt24() {
        return it24;
    }

    public void setIt25(RichInputText it25) {
        this.it25 = it25;
    }

    public RichInputText getIt25() {
        return it25;
    }

    public void setIt26(RichInputText it26) {
        this.it26 = it26;
    }

    public RichInputText getIt26() {
        return it26;
    }

    public void setCb31(RichCommandButton cb31) {
        this.cb31 = cb31;
    }

    public RichCommandButton getCb31() {
        return cb31;
    }

    public void setG4(UIXGroup g4) {
        this.g4 = g4;
    }

    public UIXGroup getG4() {
        return g4;
    }

    public void setPgl14(RichPanelGroupLayout pgl14) {
        this.pgl14 = pgl14;
    }

    public RichPanelGroupLayout getPgl14() {
        return pgl14;
    }

    public void setCb32(RichCommandButton cb32) {
        this.cb32 = cb32;
    }

    public RichCommandButton getCb32() {
        return cb32;
    }

    public void setPw6(RichPanelWindow pw6) {
        this.pw6 = pw6;
    }

    public RichPanelWindow getPw6() {
        return pw6;
    }

    public void setPfl6(RichPanelFormLayout pfl6) {
        this.pfl6 = pfl6;
    }

    public RichPanelFormLayout getPfl6() {
        return pfl6;
    }

    public void setIt27(RichInputText it27) {
        this.it27 = it27;
    }

    public RichInputText getIt27() {
        return it27;
    }

    public void setIt28(RichInputText it28) {
        this.it28 = it28;
    }

    public RichInputText getIt28() {
        return it28;
    }

    public void setIt29(RichInputText it29) {
        this.it29 = it29;
    }

    public RichInputText getIt29() {
        return it29;
    }

    public void setIt30(RichInputText it30) {
        this.it30 = it30;
    }

    public RichInputText getIt30() {
        return it30;
    }

    public void setIt31(RichInputText it31) {
        this.it31 = it31;
    }

    public RichInputText getIt31() {
        return it31;
    }

    public void setIt32(RichInputText it32) {
        this.it32 = it32;
    }

    public RichInputText getIt32() {
        return it32;
    }

    public void setIt33(RichInputText it33) {
        this.it33 = it33;
    }

    public RichInputText getIt33() {
        return it33;
    }

    public void setCb33(RichCommandButton cb33) {
        this.cb33 = cb33;
    }

    public RichCommandButton getCb33() {
        return cb33;
    }

    public void setG5(UIXGroup g5) {
        this.g5 = g5;
    }

    public UIXGroup getG5() {
        return g5;
    }

    public void setPgl15(RichPanelGroupLayout pgl15) {
        this.pgl15 = pgl15;
    }

    public RichPanelGroupLayout getPgl15() {
        return pgl15;
    }

    public void setCb34(RichCommandButton cb34) {
        this.cb34 = cb34;
    }

    public RichCommandButton getCb34() {
        return cb34;
    }

    public void setPgl16(RichPanelGroupLayout pgl16) {
        this.pgl16 = pgl16;
    }

    public RichPanelGroupLayout getPgl16() {
        return pgl16;
    }

    public void setCb35(RichCommandButton cb35) {
        this.cb35 = cb35;
    }

    public RichCommandButton getCb35() {
        return cb35;
    }

    public void setCb36(RichCommandButton cb36) {
        this.cb36 = cb36;
    }

    public RichCommandButton getCb36() {
        return cb36;
    }

    public void setCb37(RichCommandButton cb37) {
        this.cb37 = cb37;
    }

    public RichCommandButton getCb37() {
        return cb37;
    }

    public void setPw7(RichPanelWindow pw7) {
        this.pw7 = pw7;
    }

    public RichPanelWindow getPw7() {
        return pw7;
    }

    public void setPfl7(RichPanelFormLayout pfl7) {
        this.pfl7 = pfl7;
    }

    public RichPanelFormLayout getPfl7() {
        return pfl7;
    }

    public void setIt34(RichInputText it34) {
        this.it34 = it34;
    }

    public RichInputText getIt34() {
        return it34;
    }

    public void setIt35(RichInputText it35) {
        this.it35 = it35;
    }

    public RichInputText getIt35() {
        return it35;
    }

    public void setIt36(RichInputText it36) {
        this.it36 = it36;
    }

    public RichInputText getIt36() {
        return it36;
    }

    public void setIt37(RichInputText it37) {
        this.it37 = it37;
    }

    public RichInputText getIt37() {
        return it37;
    }

    public void setIt38(RichInputText it38) {
        this.it38 = it38;
    }

    public RichInputText getIt38() {
        return it38;
    }

    public void setIt39(RichInputText it39) {
        this.it39 = it39;
    }

    public RichInputText getIt39() {
        return it39;
    }

    public void setIt40(RichInputText it40) {
        this.it40 = it40;
    }

    public RichInputText getIt40() {
        return it40;
    }

    public void setCb38(RichCommandButton cb38) {
        this.cb38 = cb38;
    }

    public RichCommandButton getCb38() {
        return cb38;
    }

    public void setG6(UIXGroup g6) {
        this.g6 = g6;
    }

    public UIXGroup getG6() {
        return g6;
    }

    public void setCb39(RichCommandButton cb39) {
        this.cb39 = cb39;
    }

    public RichCommandButton getCb39() {
        return cb39;
    }

    public void setPgl17(RichPanelGroupLayout pgl17) {
        this.pgl17 = pgl17;
    }

    public RichPanelGroupLayout getPgl17() {
        return pgl17;
    }

    public void setPgl18(RichPanelGroupLayout pgl18) {
        this.pgl18 = pgl18;
    }

    public RichPanelGroupLayout getPgl18() {
        return pgl18;
    }

    public void setCb40(RichCommandButton cb40) {
        this.cb40 = cb40;
    }

    public RichCommandButton getCb40() {
        return cb40;
    }

    public void setCb41(RichCommandButton cb41) {
        this.cb41 = cb41;
    }

    public RichCommandButton getCb41() {
        return cb41;
    }

    public void setCb42(RichCommandButton cb42) {
        this.cb42 = cb42;
    }

    public RichCommandButton getCb42() {
        return cb42;
    }


    public void setOt6(RichOutputText ot6) {
        this.ot6 = ot6;
    }

    public RichOutputText getOt6() {
        return ot6;
    }

    public void setPgl19(RichPanelGroupLayout pgl19) {
        this.pgl19 = pgl19;
    }

    public RichPanelGroupLayout getPgl19() {
        return pgl19;
    }

    public void setOt7(RichOutputText ot7) {
        this.ot7 = ot7;
    }

    public RichOutputText getOt7() {
        return ot7;
    }


    public void setPs3(RichPanelSplitter ps3) {
        this.ps3 = ps3;
    }

    public RichPanelSplitter getPs3() {
        return ps3;
    }

    public void setPgl21(RichPanelGroupLayout pgl21) {
        this.pgl21 = pgl21;
    }

    public RichPanelGroupLayout getPgl21() {
        return pgl21;
    }


    public void setOt9(RichOutputText ot9) {
        this.ot9 = ot9;
    }

    public RichOutputText getOt9() {
        return ot9;
    }


    public void setPgl20(RichPanelGroupLayout pgl20) {
        this.pgl20 = pgl20;
    }

    public RichPanelGroupLayout getPgl20() {
        return pgl20;
    }

    public void setOt11(RichOutputText ot11) {
        this.ot11 = ot11;
    }

    public RichOutputText getOt11() {
        return ot11;
    }

    public void setOt12(RichOutputText ot12) {
        this.ot12 = ot12;
    }

    public RichOutputText getOt12() {
        return ot12;
    }

    public void setOt13(RichOutputText ot13) {
        this.ot13 = ot13;
    }

    public RichOutputText getOt13() {
        return ot13;
    }

    public void setOt14(RichOutputText ot14) {
        this.ot14 = ot14;
    }

    public RichOutputText getOt14() {
        return ot14;
    }

    public void setOt15(RichOutputText ot15) {
        this.ot15 = ot15;
    }

    public RichOutputText getOt15() {
        return ot15;
    }

    public void setI1(RichImage i1) {
        this.i1 = i1;
    }

    public RichImage getI1() {
        return i1;
    }


    public void setPgl22(RichPanelGroupLayout pgl22) {
        this.pgl22 = pgl22;
    }

    public RichPanelGroupLayout getPgl22() {
        return pgl22;
    }

    public void setS2(RichSpacer s2) {
        this.s2 = s2;
    }

    public RichSpacer getS2() {
        return s2;
    }

    public void setPsl1(RichPanelStretchLayout psl1) {
        this.psl1 = psl1;
    }

    public RichPanelStretchLayout getPsl1() {
        return psl1;
    }

    public void setI2(RichImage i2) {
        this.i2 = i2;
    }

    public RichImage getI2() {
        return i2;
    }

    public void setPgl23(RichPanelGroupLayout pgl23) {
        this.pgl23 = pgl23;
    }

    public RichPanelGroupLayout getPgl23() {
        return pgl23;
    }

    public void setPa1(RichPanelAccordion pa1) {
        this.pa1 = pa1;
    }

    public RichPanelAccordion getPa1() {
        return pa1;
    }

    public void setSdi1(RichShowDetailItem sdi1) {
        this.sdi1 = sdi1;
    }

    public RichShowDetailItem getSdi1() {
        return sdi1;
    }

    public void setPa2(RichPanelAccordion pa2) {
        this.pa2 = pa2;
    }

    public RichPanelAccordion getPa2() {
        return pa2;
    }

    public void setSdi2(RichShowDetailItem sdi2) {
        this.sdi2 = sdi2;
    }

    public RichShowDetailItem getSdi2() {
        return sdi2;
    }

    public void setI3(RichImage i3) {
        this.i3 = i3;
    }

    public RichImage getI3() {
        return i3;
    }

    public void setS3(RichSpacer s3) {
        this.s3 = s3;
    }

    public RichSpacer getS3() {
        return s3;
    }

    public void setS4(RichSpacer s4) {
        this.s4 = s4;
    }

    public RichSpacer getS4() {
        return s4;
    }

    public void setOt8(RichOutputText ot8) {
        this.ot8 = ot8;
    }

    public RichOutputText getOt8() {
        return ot8;
    }
}
