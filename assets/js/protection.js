/* Restricción superficial de interacción, adaptada del ejemplo del docente.
   No impide acceso a fuentes, capturas ni herramientas externas. */
(() => {
  const area = document.querySelector('[data-protected="true"]');
  if (!area) return;
  area.classList.add('protected');
  const editable = target => target instanceof Element && Boolean(target.closest('input,textarea,select,[contenteditable="true"]'));
  for (const eventName of ['contextmenu','selectstart','copy','cut','dragstart']) {
    area.addEventListener(eventName,event => { if(!editable(event.target)) event.preventDefault(); });
  }
  document.addEventListener('keydown',event => {
    if(editable(event.target)) return;
    const key=event.key.toLowerCase(), modifier=event.ctrlKey||event.metaKey;
    if((modifier&&['c','s','u','a'].includes(key)) || key==='f12' ||
      (modifier&&event.shiftKey&&['i','j','c'].includes(key)) ||
      (event.metaKey&&event.altKey&&key==='i')) event.preventDefault();
  });
})();
