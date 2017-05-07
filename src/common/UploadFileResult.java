package common;

/**
 * 上传文件操作结果
 * @author yzj
 * OK-操作成功 unAuthorized-未登录  wrong-文件/用户不存在或无权操作
 * tooLarge-文件太大 unknownError-未知错误
 */
public enum UploadFileResult {
    OK("OK"),unAuthorized("unAuthorized"),wrong("wrong"),tooLarge("tooLarge"),
    unknownError("unknownError");
    
    private String status;
    /**
     * 私有构造方法
     * @param 文件操作状态
     */
    private UploadFileResult(String status){
      this.status=status;
    }
    /**
     * 获取字符串
     */
    public String getStatus() {
      return status;
    }
}

