function myQuery(selector) {
  var e;
  if (selector.indexOf('<') == 0) { 
    // tag name => "<tr>"
    var tagName = selector.substring(1, selector.length - 1);
    e = document.createElement(tagName);
     
  } else {
    e = document.querySelector(selector);
  }
  
  e.click = function(cb) {
    e.onclick = cb;
    return e;
  };
  
  e.append = function(child) {
    e.appendChild(child);
    return e;
  };
  
  e.html = function(content) {
    e.innerHTML = content;
    return e;
  };
  
  e.appendTo = function(parent) {
    parent.appendChild(e);
    return e;
  };
  
  return e;
}

// function = object + 함수코드

myQuery.ajax = function(url, settings) {
  if ((typeof url) == "string") {
    settings.url = url;
  } else {
    settings = url;
  }
  var xhr = new XMLHttpRequest();
    xhr.onreadystatechange = () => {
        if (xhr.readyState == 4) {
            if (xhr.status == 200) {
              if (settings.dataType == "json") {
                settings.success(JSON.parse(xhr.responseText));
              } else {
                settings.success(xhr.responseText);
              }
            }
        }
    };
    xhr.open(settings.method, settings.url, true);
    xhr.send();
};

myQuery.getJSON = function(url, success) {
  myQuery.ajax(url, {
    method: 'GET',
    dataType: 'json',
    success: success
  });
};

var $ = myQuery;














