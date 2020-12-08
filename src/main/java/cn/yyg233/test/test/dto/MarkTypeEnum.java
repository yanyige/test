package cn.yyg233.test.test.dto;

/**
 * @author yige.yyg (奕格)
 * @date 2020/12/8
 */
public enum MarkTypeEnum {
    /**
     * 符合规范DDL
     */
    NORMAL(0),
    /**
     * 忽略的DDL
     */
    IGNORE(1),
    /**
     * 告警DDL
     */
    WARNING(2),
    /**
     * 未知DDL
     */
    UNKNOWN(3),
    /**
     * 严重DDL
     */
    CRITICAL(4);

    private int value;

    private MarkTypeEnum(int value) {
        this.value = value;
    }
}
