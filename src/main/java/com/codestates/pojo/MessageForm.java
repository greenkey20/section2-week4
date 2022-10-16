package com.codestates.pojo;

// 2022.10.17(월) 19h20
// MessageForm 클래스 != POJO <- POJO는 Java나 Java의 스펙/사양에 정의된 것 이외에는 다른 기술이나 규약에 얽매이지 않아야 함
public class MessageForm /*extends ActionForm*/ { // 과거의 Struts라는 웹 프레임워크/기술을 사용하기 위해 Struts에서 지원하는 ActionForm 클래스를 상속받음 = 특정 기술을 상속해서 코드 작성 -> 추후 애플리케이션 요구사항 변경에 따라 다른 기술로 변경하려면, Struts의 클래스를 명시적으로 사용했던 부분에 대해 모두 일일이 제거/수정 필요
    String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
