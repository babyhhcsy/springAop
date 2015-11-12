package com.bird.annotation;

import java.util.Date;

public class WxLog {
    private String id;

    private Date createDate;

    private Date updateDate;

    private String methodName;

    private String event;

    private String paramin;

    private String paramout;

    private String openid;

    private String phone;

    private String command;

    private String activityName;

    private String ip;

    private String url;
    private Date methodEnterDate;

    private Date methodOutDate;
    
    private String className;

    private String errorMessage;

    private String remark;

    private String description;

    private String methodTime;
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName == null ? null : methodName.trim();
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event == null ? null : event.trim();
    }

    public String getParamin() {
        return paramin;
    }

    public void setParamin(String paramin) {
        this.paramin = paramin == null ? null : paramin.trim();
    }

    public String getParamout() {
        return paramout;
    }

    public void setParamout(String paramout) {
        this.paramout = paramout == null ? null : paramout.trim();
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command == null ? null : command.trim();
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName == null ? null : activityName.trim();
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

	public Date getMethodEnterDate() {
		return methodEnterDate;
	}

	public void setMethodEnterDate(Date methodEnterDate) {
		this.methodEnterDate = methodEnterDate;
	}

	public Date getMethodOutDate() {
		return methodOutDate;
	}

	public void setMethodOutDate(Date methodOutDate) {
		this.methodOutDate = methodOutDate;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getMethodTime() {
		return methodTime;
	}

	public void setMethodTime(String methodTime) {
		this.methodTime = methodTime;
	}

	@Override
	public String toString() {
		return "WxLog [id=" + id + ", createDate=" + createDate + ", updateDate=" + updateDate + ", methodName="
				+ methodName + ", event=" + event + ", paramin=" + paramin + ", paramout=" + paramout + ", openid="
				+ openid + ", phone=" + phone + ", command=" + command + ", activityName=" + activityName + ", ip=" + ip
				+ ", url=" + url + ", methodEnterDate=" + methodEnterDate + ", methodOutDate=" + methodOutDate
				+ ", className=" + className + ", errorMessage=" + errorMessage + ", remark=" + remark
				+ ", description=" + description + ", methodTime=" + methodTime + "]";
	}
    
}