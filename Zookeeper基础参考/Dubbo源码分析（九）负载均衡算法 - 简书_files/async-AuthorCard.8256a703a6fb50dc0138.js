(window.webpackJsonp=window.webpackJsonp||[]).push([[3],{aX9s:function(t,e,a){"use strict";a.r(e);a("f3/d");var n=a("ln6h"),i=a.n(n),s=(a("ls82"),a("O40h")),r=(a("tUrg"),a("doui")),o=a("q1tI"),c=a.n(o),l=a("/MKj"),u=a("NTd/"),m=a.n(u),g=a("gY8I"),p=a("xdjK"),d=a("g3DI"),f=a("5+Dc"),v=a("f1tA"),b=a("G9T2"),_=a("9OZg"),O=a("qwOC"),N=a("3Ygt"),T=a("Og5S"),w=a("mlqF"),j=a("g3D1"),h=a.n(j),D=c.a.createElement,E=function(t){var e=t.slug,a=t.title,n=t.viewCount,i=t.index+1,s=Object(f.b)(function(){M.$sensor.trackEvent(M.$sensor.events.NOTE_PAGE_RIGHT_AUTHOR_NOTE_IMPRESSION,{position:i})},{rootMargin:"-56px -56px 0px 0px"}),c=Object(r.a)(s,1)[0],l=Object(o.useCallback)(function(){M.$sensor.trackEvent(M.$sensor.events.NOTE_PAGE_RIGHT_AUTHOR_NOTE_CLICK,{position:i})},[i]);return D("div",{ref:c,key:e,className:h.a["list-item"],role:"listitem"},D("div",{className:h.a["list-title"],title:a},D(_.a,{className:h.a.link,to:"/p/".concat(e),openNewTab:!0,onClick:l},a)),D("div",{className:h.a["list-count"]},m.a.get("common.read")," ",n.toLocaleString()))};e.default=Object(l.b)(function(t){return{noteData:Object(p.h)(t),authorData:Object(p.a)(t),diamondRateData:Object(p.e)(t)}},function(t){return{$getDiamondRate:function(){return t({type:g.a.GET_DIAMOND_RATE})}}})(Object(v.a)(function(t){var e=t.$getDiamondRate,a=t.noteData,n=t.authorData,r=t.diamondRateData,l=a.get("id"),u=a.get("is_author"),g=n.get("nickname"),p=n.get("avatar"),v=n.get("slug"),j="/u/".concat(v),k=Object(o.useState)([]),x=k[0],G=k[1],I=n.get("fpValue"),R=n.get("fpRMB"),M=r.get("displayable",!1);Object(f.c)(function(){e()}),Object(o.useEffect)(function(){!function(){var t=Object(s.a)(i.a.mark(function t(){var e,a;return i.a.wrap(function(t){for(;;)switch(t.prev=t.next){case 0:return t.prev=0,t.next=3,Object(d.g)(l);case 3:e=t.sent,a=e.data,window.requestAnimationFrame(function(){G(a)}),t.next=10;break;case 8:t.prev=8,t.t0=t.catch(0);case 10:case"end":return t.stop()}},t,null,[[0,8]])}));return function(){return t.apply(this,arguments)}}()()},[l]);var A=Object(o.useMemo)(function(){var t=n.get("badges").first();return t?D(T.a,{className:h.a.badge,intro:t.get("text"),introUrl:t.get("intro_url"),imageUrl:t.get("image_url")}):null},[n]);return D(b.a,{position:"right"},D("div",{className:h.a["user-wrapper"]},D(_.a,{to:j,openNewTab:!0},D("img",{className:h.a.avatar,src:Object(w.b)(p,{width:90}).zoomedUrl,alt:""})),D("div",{className:h.a.user},D("div",{className:h.a.title},D("div",{className:h.a.info},D("span",{className:h.a.name,title:g},D(_.a,{to:j,openNewTab:!0},g)),A),!u&&D(O.a,{className:h.a.btn,size:"small",place:"\u6587\u7ae0\u9875\u53f3\u4fa7\u4f5c\u8005\u5361\u7247"})),D("div",{className:h.a.fp},m.a.get("common.totalAssets",{num:I.toLocaleString()}),M&&R?m.a.get("common.diamondValue",{num:R}):""))),x.length>0?D(c.a.Fragment,null,D(N.a,null),x.map(function(t,e){var a=t.slug,n=t.title,i=t.view_count;return D(E,{key:a,slug:a,title:n,viewCount:i,index:e})})):null)}))},g3D1:function(t,e,a){t.exports={"user-wrapper":"_3Oo-T1",userWrapper:"_3Oo-T1",avatar:"_3T9iJQ",user:"_32ZTTG",title:"_2O0T_w",info:"_2v-h3G",name:"_2vh4fr",btn:"tzrf9N",badge:"_3jsL5v",fp:"_1pXc22","list-item":"_26Hhi2",listItem:"_26Hhi2","list-title":"_3TNGId",listTitle:"_3TNGId","list-count":"DfvGP9",listCount:"DfvGP9",link:"_2ER8Tt"}}}]);