package com.elad.data;

/**
 * Created by eladw on 5/7/18.
 * Statusof stream
 */
public class StreamStatus {

    private final long id;
    private final String streamName;
    private final String status;
    private final String content;

    public StreamStatus(long id, String streamName, String status, String content) {
        this.id = id;
        this.streamName = streamName;
        this.status = status;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getStreamName() {
        return streamName;
    }

    public String getContent() {
        return content;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("StreamStatus{");
        sb.append("id=").append(id);
        sb.append(", streamName='").append(streamName).append('\'');
        sb.append(", status='").append(status).append('\'');
        sb.append(", content='").append(content).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
