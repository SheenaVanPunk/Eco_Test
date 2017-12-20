/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domen;

/**
 *
 * @author qa
 */
public class IndexSlider {
    private int id;
    private char title;
    private String desciption;
    private char linkType;
    private char linkLabel;
    private char internalLinkUrl;
    private char externalLinkUrl;
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public char getTitle() {
        return title;
    }

    public void setTitle(char title) {
        this.title = title;
    }

    public String getDesciption() {
        return desciption;
    }

    public void setDesciption(String desciption) {
        this.desciption = desciption;
    }

    public char getLinkType() {
        return linkType;
    }

    public void setLinkType(char linkType) {
        this.linkType = linkType;
    }

    public char getLinkLabel() {
        return linkLabel;
    }

    public void setLinkLabel(char linkLabel) {
        this.linkLabel = linkLabel;
    }

    public char getInternalLinkUrl() {
        return internalLinkUrl;
    }

    public void setInternalLinkUrl(char internalLinkUrl) {
        this.internalLinkUrl = internalLinkUrl;
    }

    public char getExternalLinkUrl() {
        return externalLinkUrl;
    }

    public void setExternalLinkUrl(char externalLinkUrl) {
        this.externalLinkUrl = externalLinkUrl;
    }
   
    
}
