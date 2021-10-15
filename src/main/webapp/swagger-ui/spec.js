﻿var getUrlHelp = window.location.href;
var getUrl = getUrlHelp.substring(getUrlHelp.indexOf("//") + 2);
getUrl = getUrl.substring(0, getUrl.indexOf("/"));

//nakon kopiranja json-a iz swagger.json filea, potrebno je zamijeniti string host s varijablom getUrl
//koja je prethodno definirana u ovoj skripti

var spec= {
  "swagger" : "2.0",
  "info" : {
    "description" : "Swagger specifikacija REST API-a za tele",
    "version" : "v1",
    "title" : "REST API za tele"
  },
  "host" : getUrl,
  "basePath" : "/tele/api",
  "tags" : [ {
    "name" : "helloService",
    "description" : "REST servis test API-ja"
  } ],
  "schemes" : [ "http", null ],
  "paths" : {
    "/helloService/isAlive" : {
      "get" : {
        "tags" : [ "helloService" ],
        "summary" : "Metoda za provjeru živosti servisa.",
        "description" : "Vraća objekt \"Hello World\" ako je servis živ.",
        "operationId" : "isAlive",
        "responses" : {
          "200" : {
            "description" : "successful operation",
            "schema" : {
              "type" : "string"
            }
          }
        }
      }
    },
    "/helloService/testPost" : {
      "post" : {
        "tags" : [ "helloService" ],
        "summary" : "Metoda za testiranje POST-a.",
        "description" : "Vraća dummy response.",
        "operationId" : "dodajSalter",
        "parameters" : [ {
          "in" : "body",
          "name" : "body",
          "description" : "Objekt koji sadrži podatke o salteru koju se dodaje.",
          "required" : true,
          "schema" : {
            "$ref" : "#/definitions/WSRequest"
          }
        } ],
        "responses" : {
          "200" : {
            "description" : "successful operation",
            "schema" : {
              "$ref" : "#/definitions/WSResponse"
            }
          }
        }
      }
    }
  },
  "definitions" : {
    "WSRequest" : {
      "type" : "object",
      "required" : [ "message" ],
      "properties" : {
        "message" : {
          "type" : "string",
          "description" : "Dummy message."
        }
      },
      "description" : "Dummy request."
    },
    "WSResponse" : {
      "type" : "object",
      "required" : [ "poruka", "status" ],
      "properties" : {
        "status" : {
          "type" : "string",
          "format" : "byte",
          "description" : "Status obrade zahtjeva prema WS-u."
        },
        "poruka" : {
          "type" : "string",
          "description" : "Poruka koja opisuje rezultat obrade zahtjeva prema WS-u."
        },
        "errors" : {
          "type" : "array",
          "items" : {
            "type" : "string"
          }
        }
      },
      "description" : "Generički response objekt kojeg naslijeđuju svi odgovori web servisa."
    }
  }
}