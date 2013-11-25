syn on

set runtimepath^=$HOME/.vim/

"編集ファイル表示
set title
"行数、列数を表示
set ruler
"行数を表示
set number

"tabspace=4
set ts=4

"全角スペース表示
highlight ZenkakuSpace cterm=underline ctermfg=lightblue guibg=darkgray
match ZenkakuSpace /　/


"不可視文字の表示
""set list
""set listchars=eol:$,tab:>\


"---mac 用設定

vmap <C-c> y:call system("pbcopy", getreg("\""))<CR>
nmap <Space><C-v> :call setreg("\"",system("pbpaste"))<CR>p

"help
helptags ~/.vim/doc



"============================"
" quickrun config
"============================"
let g:quickrun_config = {}
"------"
" quickrunのどのファイルタイプでも適用する設定
"--SphinxのTopフォルダにいないと実行できない。"
let g:quickrun_config['rst'] = {
	\ 'command': 'sphinx-build', 
	\ 'cmdopt': '-b html -d _build/doctrees .  _build/html'
	\ }

let g:quickrun_config['c'] = {
	\ 'command': 'gcc', 
	\ 'cmdopt': ''
	\ }

""""""""""""""""""""""""""
" neocompiletecach
""""""""""""""""""""""""""
let g:neocomplcache_enable_at_startup = 1
"ユーザ定義の辞書を指定
let g:neocomplcache_dictionary_filetype_lists = {
  \ 'default' : '',
  \ 'scala' : $HOME . '/.vim/dict/scala.dict',
  \ }


""""""""""""""""""""""""""
"VimShell
""""""""""""""""""""""""""
let g:VimShell_EnableInteractive = 1


"================================
" .vimrc編集、反映ショートカット
"================================
nnoremap <Space>. :<C-u>edit $MYVIMRC<CR>
nnoremap <Space>, :<C-u>source $MYVIMRC<CR>


"==============================
"
"
"==============================

nnoremap <silent> <Space>uo :<C-u>:Unite -vertical -no-quit outline<CR>
nnoremap <silent> <Space>uf :<C-u>:Unite -vertical -no-quit file<CR>











