package common;

/**
 * ±ê¼ÇµÇÂ¼×´Ì¬
 * @author yzj
 * OK-µÇÂ¼³É¹¦
 * wrong-µÇÂ¼Ê§°Ü
 */
public enum LoginResult {
	OK("OK"), wrong("wrong"),unknownError("unknownError");

    private String status;
    /**
     * Ë½ÓÐ¹¹Ôì·½·¨
     * @param µÇÂ¼×´Ì¬
     */
    private LoginResult(String status){
      this.status=status;
    }
    /**
     * »ñÈ¡µÇÂ¼×´Ì¬
     */
    public String getStatus() {
      return status;
    }
    /**
     * Éè¶¨µÇÂ¼×´Ì¬
     */
    public void setStatus(String status) {
      this.status = status;
    }
}
