package common;

/**
 * 文件操作结果
 * @author yzj
 * OK-操作成功 unAuthorized-未登录  wrong-文件不存在或无权操作 tooLong-备注太长
 * unknownError-未知错误
 */
public enum AddNoteResult {
    OK("OK"),unAuthorized("unAuthorized"),wrong("wrong"),tooLong("tooLong"),
    unknownError("unknownError");
    
    private String status;
    /**
     * 私有构造方法
     * @param 备注操作状态
     */
    private AddNoteResult(String status){
      this.status=status;
    }
    /**
     * 获取字符串
     */
    public String getStatus() {
      return status;
    }

}

