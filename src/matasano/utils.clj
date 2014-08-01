(ns matasano.utils
  (:import (org.apache.commons.codec.binary Base64 Hex)))


(defn encodeBase64 [hexstring]
  (-> (.toCharArray hexstring)
      Hex/decodeHex
      Base64/encodeBase64String)
  )

(defn decodeBase64 [strr]
  (String. (Base64/decodeBase64 strr)))
;; SSdtIGtpbGxpbmcgeW91ciBicmFpbiBsaWtlIGEgcG9pc29ub3VzIG11c2hyb29t
