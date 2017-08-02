import { BootAngularPage } from './app.po';

describe('bootangular App', () => {
  let page: BootAngularPage;

  beforeEach(() => {
    page = new BootAngularPage();
  });

  it('should display welcome message', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('Welcome to app!');
  });
});
