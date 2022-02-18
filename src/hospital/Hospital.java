package hospital;

import lombok.Data;

@Data
public class Hospital {

    private String addr; // 주소
    private String mgtStaDd; // 운영시작일자
    private String pcrPsblYn; // 구분코드
    private String ratPsblYn; // RAT가능여부
    private String recuClCd; // 요양종별코드
    private String sgguCdNm; // 시군구명
    private String sidoCdNm; // 시도명
    private String XPosWgs84; // 세계지구x좌표
    private String YPosWgs84; // 세계지구y좌표
    private String yadmNm; // 요양기관명
    private String ykihoEnc; // 암호화된요양기호

    public Hospital(
            String addr,
            String mgtStaDd,
            String pcrPsblYn,
            String ratPsblYn,
            String recuClCd,
            String sgguCdNm,
            String sidoCdNm,
            String XPosWgs84,
            String YPosWgs84,
            String yadmNm,
            String ykihoEnc) {

        this.addr = addr;
        this.mgtStaDd = mgtStaDd;
        this.pcrPsblYn = pcrPsblYn;
        this.ratPsblYn = ratPsblYn;
        this.recuClCd = recuClCd;
        this.sgguCdNm = sgguCdNm;
        this.sidoCdNm = sidoCdNm;
        this.XPosWgs84 = XPosWgs84;
        this.YPosWgs84 = YPosWgs84;
        this.yadmNm = yadmNm;
        this.ykihoEnc = ykihoEnc;

    }
}
