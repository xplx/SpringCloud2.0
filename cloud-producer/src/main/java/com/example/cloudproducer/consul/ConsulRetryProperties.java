//package com.example.cloudproducer.consul;
//
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.context.annotation.Configuration;
//
///**
// * @author wuxiaopeng
// * @description:
// * @date 2020/1/9 14:15
// */
//@Configuration
//@ConfigurationProperties("spring.cloud.consul.retry")
//public class ConsulRetryProperties {
//    private long initialInterval = 10000L;
//    private double multiplier = 1.1D;
//    private long maxInterval = 20000L;
//    private int maxAttempts = 6;
//
//    public ConsulRetryProperties() {
//    }
//
//    public long getInitialInterval() {
//        return this.initialInterval;
//    }
//
//    public double getMultiplier() {
//        return this.multiplier;
//    }
//
//    public long getMaxInterval() {
//        return this.maxInterval;
//    }
//
//    public int getMaxAttempts() {
//        return this.maxAttempts;
//    }
//
//    public void setInitialInterval(final long initialInterval) {
//        this.initialInterval = initialInterval;
//    }
//
//    public void setMultiplier(final double multiplier) {
//        this.multiplier = multiplier;
//    }
//
//    public void setMaxInterval(final long maxInterval) {
//        this.maxInterval = maxInterval;
//    }
//
//    public void setMaxAttempts(final int maxAttempts) {
//        this.maxAttempts = maxAttempts;
//    }
//
//    @Override
//    public boolean equals(final Object o) {
//        if (o == this) {
//            return true;
//        } else if (!(o instanceof ConsulRetryProperties)) {
//            return false;
//        } else {
//            ConsulRetryProperties other = (ConsulRetryProperties)o;
//            if (!other.canEqual(this)) {
//                return false;
//            } else if (this.getInitialInterval() != other.getInitialInterval()) {
//                return false;
//            } else if (Double.compare(this.getMultiplier(), other.getMultiplier()) != 0) {
//                return false;
//            } else if (this.getMaxInterval() != other.getMaxInterval()) {
//                return false;
//            } else {
//                return this.getMaxAttempts() == other.getMaxAttempts();
//            }
//        }
//    }
//
//    protected boolean canEqual(final Object other) {
//        return other instanceof ConsulRetryProperties;
//    }
//
//    @Override
//    public int hashCode() {
//        Boolean PRIME = true;
//        int result = 1;
//        long $initialInterval = this.getInitialInterval();
//        result = result * 59 + (int)($initialInterval >>> 32 ^ $initialInterval);
//        long $multiplier = Double.doubleToLongBits(this.getMultiplier());
//        result = result * 59 + (int)($multiplier >>> 32 ^ $multiplier);
//        long $maxInterval = this.getMaxInterval();
//        result = result * 59 + (int)($maxInterval >>> 32 ^ $maxInterval);
//        result = result * 59 + this.getMaxAttempts();
//        return result;
//    }
//
//    @Override
//    public String toString() {
//        return "ConsulRetryProperties(initialInterval=" + this.getInitialInterval() + ", multiplier=" + this.getMultiplier() + ", maxInterval=" + this.getMaxInterval() + ", maxAttempts=" + this.getMaxAttempts() + ")";
//    }
//}
