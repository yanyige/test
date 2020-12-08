package cn.yyg233.test.test.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;

import cn.yyg233.test.test.dto.MarkTypeEnum;

/**
 * @author yige.yyg (奕格)
 * @date 2020/12/8
 */
public class TestFastJson {
    public static void main(String[] args) {
        String defaultDdlRule = "{\"ALTERADDCOLUMN\":\"NORMAL\",\"ALTERDROPCOLUMN\":\"IGNORE\",\"ALTERRENAMECOLUMN\":\"WARNING\"}";
        DdlType ddlType = JSON.parseObject(defaultDdlRule,
            new TypeReference<DdlType>() {
            });
    }
}

class DdlType {
    MarkTypeEnum ALTERADDCOLUMN;
    MarkTypeEnum ALTERDROPCOLUMN;
    MarkTypeEnum ALTERRENAMECOLUMN;
    MarkTypeEnum ALTERRENAMETABLE;
    MarkTypeEnum CREATEFUNCTION;
    MarkTypeEnum CREATEINDEX;
    MarkTypeEnum CREATEPROCEDURE;
    MarkTypeEnum CREATETABLE;
    MarkTypeEnum CREATEVIEW;
    MarkTypeEnum DROPINDEX;
    MarkTypeEnum DROPTABLE;
    MarkTypeEnum DROPVIEW;
    MarkTypeEnum TRUNCATETABLE;
    MarkTypeEnum COMMENTONTABLE;
    MarkTypeEnum COMMENTONCOLUMN;
    MarkTypeEnum ALTERMODIFYTYPE;
    MarkTypeEnum UNKNOWN;

    public MarkTypeEnum getALTERADDCOLUMN() {
        return ALTERADDCOLUMN;
    }

    public void setALTERADDCOLUMN(MarkTypeEnum ALTERADDCOLUMN) {
        this.ALTERADDCOLUMN = ALTERADDCOLUMN;
    }

    public MarkTypeEnum getALTERDROPCOLUMN() {
        return ALTERDROPCOLUMN;
    }

    public void setALTERDROPCOLUMN(MarkTypeEnum ALTERDROPCOLUMN) {
        this.ALTERDROPCOLUMN = ALTERDROPCOLUMN;
    }

    public MarkTypeEnum getALTERRENAMECOLUMN() {
        return ALTERRENAMECOLUMN;
    }

    public void setALTERRENAMECOLUMN(MarkTypeEnum ALTERRENAMECOLUMN) {
        this.ALTERRENAMECOLUMN = ALTERRENAMECOLUMN;
    }

    public MarkTypeEnum getALTERRENAMETABLE() {
        return ALTERRENAMETABLE;
    }

    public void setALTERRENAMETABLE(MarkTypeEnum ALTERRENAMETABLE) {
        this.ALTERRENAMETABLE = ALTERRENAMETABLE;
    }

    public MarkTypeEnum getCREATEFUNCTION() {
        return CREATEFUNCTION;
    }

    public void setCREATEFUNCTION(MarkTypeEnum CREATEFUNCTION) {
        this.CREATEFUNCTION = CREATEFUNCTION;
    }

    public MarkTypeEnum getCREATEINDEX() {
        return CREATEINDEX;
    }

    public void setCREATEINDEX(MarkTypeEnum CREATEINDEX) {
        this.CREATEINDEX = CREATEINDEX;
    }

    public MarkTypeEnum getCREATEPROCEDURE() {
        return CREATEPROCEDURE;
    }

    public void setCREATEPROCEDURE(MarkTypeEnum CREATEPROCEDURE) {
        this.CREATEPROCEDURE = CREATEPROCEDURE;
    }

    public MarkTypeEnum getCREATETABLE() {
        return CREATETABLE;
    }

    public void setCREATETABLE(MarkTypeEnum CREATETABLE) {
        this.CREATETABLE = CREATETABLE;
    }

    public MarkTypeEnum getCREATEVIEW() {
        return CREATEVIEW;
    }

    public void setCREATEVIEW(MarkTypeEnum CREATEVIEW) {
        this.CREATEVIEW = CREATEVIEW;
    }

    public MarkTypeEnum getDROPINDEX() {
        return DROPINDEX;
    }

    public void setDROPINDEX(MarkTypeEnum DROPINDEX) {
        this.DROPINDEX = DROPINDEX;
    }

    public MarkTypeEnum getDROPTABLE() {
        return DROPTABLE;
    }

    public void setDROPTABLE(MarkTypeEnum DROPTABLE) {
        this.DROPTABLE = DROPTABLE;
    }

    public MarkTypeEnum getDROPVIEW() {
        return DROPVIEW;
    }

    public void setDROPVIEW(MarkTypeEnum DROPVIEW) {
        this.DROPVIEW = DROPVIEW;
    }

    public MarkTypeEnum getTRUNCATETABLE() {
        return TRUNCATETABLE;
    }

    public void setTRUNCATETABLE(MarkTypeEnum TRUNCATETABLE) {
        this.TRUNCATETABLE = TRUNCATETABLE;
    }

    public MarkTypeEnum getCOMMENTONTABLE() {
        return COMMENTONTABLE;
    }

    public void setCOMMENTONTABLE(MarkTypeEnum COMMENTONTABLE) {
        this.COMMENTONTABLE = COMMENTONTABLE;
    }

    public MarkTypeEnum getCOMMENTONCOLUMN() {
        return COMMENTONCOLUMN;
    }

    public void setCOMMENTONCOLUMN(MarkTypeEnum COMMENTONCOLUMN) {
        this.COMMENTONCOLUMN = COMMENTONCOLUMN;
    }

    public MarkTypeEnum getALTERMODIFYTYPE() {
        return ALTERMODIFYTYPE;
    }

    public void setALTERMODIFYTYPE(MarkTypeEnum ALTERMODIFYTYPE) {
        this.ALTERMODIFYTYPE = ALTERMODIFYTYPE;
    }

    public MarkTypeEnum getUNKNOWN() {
        return UNKNOWN;
    }

    public void setUNKNOWN(MarkTypeEnum UNKNOWN) {
        this.UNKNOWN = UNKNOWN;
    }
}
