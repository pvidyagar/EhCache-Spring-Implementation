package com.concretepage;

public class Greeting {

    private  long id;
    private  String content;
    
    public Greeting() {
        
    }

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    @Override
	public String toString() {
		return "Greeting [id=" + id + ", content=" + content + "]";
	}

	public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}