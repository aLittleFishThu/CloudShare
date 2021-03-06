package common;

/**
 * 备注操作结果
 * @author yzj
 * OK-操作成功 unAuthorized-未登录  wrong-文件/备注不存在或无权操作
 * unknownError-未知错误
 */
public enum DeleteNoteResult {
    OK("OK"),unAuthorized("unAuthorized"),wrong("wrong"),
    unknownError("unknownError");
    
    private String status;
    /**
     * 私有构造方法
     * @param 备注操作状态
     */
    private DeleteNoteResult(String status){
      this.status=status;
    }
    /**
     * 获取字符串
     */
    public String getStatus() {
      return status;
    }

}

