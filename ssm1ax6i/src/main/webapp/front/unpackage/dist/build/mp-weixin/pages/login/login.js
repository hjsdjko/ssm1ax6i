(global["webpackJsonp"]=global["webpackJsonp"]||[]).push([["pages/login/login"],{"1dc8":function(n,t,e){"use strict";e.r(t);var a=e("238a"),o=e("a47f");for(var i in o)"default"!==i&&function(n){e.d(t,n,(function(){return o[n]}))}(i);e("ee7a");var r,u=e("f0c5"),s=Object(u["a"])(o["default"],a["b"],a["c"],!1,null,"e2885086",null,!1,a["a"],r);t["default"]=s.exports},"238a":function(n,t,e){"use strict";var a;e.d(t,"b",(function(){return o})),e.d(t,"c",(function(){return i})),e.d(t,"a",(function(){return a}));var o=function(){var n=this,t=n.$createElement;n._self._c},i=[]},"30a1":function(n,t,e){"use strict";(function(n){e("87b8");a(e("66fd"));var t=a(e("1dc8"));function a(n){return n&&n.__esModule?n:{default:n}}n(t.default)}).call(this,e("543d")["createPage"])},"674c":function(n,t,e){},a47f:function(n,t,e){"use strict";e.r(t);var a=e("cb4b"),o=e.n(a);for(var i in a)"default"!==i&&function(n){e.d(t,n,(function(){return a[n]}))}(i);t["default"]=o.a},cb4b:function(n,t,e){"use strict";(function(n){Object.defineProperty(t,"__esModule",{value:!0}),t.default=void 0;var a=i(e("a34a")),o=i(e("e06d"));function i(n){return n&&n.__esModule?n:{default:n}}function r(n,t,e,a,o,i,r){try{var u=n[i](r),s=u.value}catch(c){return void e(c)}u.done?t(s):Promise.resolve(s).then(a,o)}function u(n){return function(){var t=this,e=arguments;return new Promise((function(a,o){var i=n.apply(t,e);function u(n){r(i,a,o,u,s,"next",n)}function s(n){r(i,a,o,u,s,"throw",n)}u(void 0)}))}}var s={data:function(){return{username:"",password:"",options:["请选择登录用户类型"],optionsValues:["","yonghu"],index:0}},onLoad:function(){var n=["请选择登录用户类型"],t=o.default.list();this.menuList=t;for(var e=0;e<this.menuList.length;e++)"是"==this.menuList[e].hasFrontLogin&&n.push(this.menuList[e].roleName);this.options=n,this.styleChange()},methods:{styleChange:function(){this.$nextTick((function(){}))},onRegisterTap:function(t){n.setStorageSync("loginTable",t),this.$utils.jump("../register/register")},onForgetTap:function(){this.$utils.jump("../forget/forget")},onLoginTap:function(){var t=this;return u(a.default.mark((function e(){var o;return a.default.wrap((function(e){while(1)switch(e.prev=e.next){case 0:if(t.optionsValues[t.index]){e.next=3;break}return t.$utils.msg("请选择登陆用户类型"),e.abrupt("return");case 3:return e.next=5,t.$api.login("".concat(t.optionsValues[t.index]),{username:t.username,password:t.password});case 5:return o=e.sent,n.setStorageSync("token",o.token),n.setStorageSync("nickname",t.username),n.setStorageSync("nowTable","".concat(t.optionsValues[t.index])),e.next=11,t.$api.session("".concat(t.optionsValues[t.index]));case 11:o=e.sent,n.setStorageSync("userid",o.data.id),n.setStorageSync("role","".concat(t.options[t.index])),t.$utils.tab("../index/index");case 15:case"end":return e.stop()}}),e)})))()},optionsChange:function(n){this.index=n.target.value}}};t.default=s}).call(this,e("543d")["default"])},ee7a:function(n,t,e){"use strict";var a=e("674c"),o=e.n(a);o.a}},[["30a1","common/runtime","common/vendor"]]]);